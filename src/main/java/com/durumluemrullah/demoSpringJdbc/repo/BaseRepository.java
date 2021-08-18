package com.durumluemrullah.demoSpringJdbc.repo;

import com.durumluemrullah.demoSpringJdbc.annotations.Collumn;
import com.durumluemrullah.demoSpringJdbc.annotations.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;


public class BaseRepository<T> {

    private final String SELECT_QUERY;
    private final String SELECT_BY_ID_QUERY;
    private final String DELETE_QUERY;
    private RowMapper rowMapper;

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public BaseRepository(String select_query, String select_by_id_query, String delete_query,RowMapper rowMapper) {
        SELECT_QUERY = select_query;
        SELECT_BY_ID_QUERY = select_by_id_query;
        DELETE_QUERY = delete_query;
        this.rowMapper=rowMapper;
    }

    public List<T> getAll(){
        List<T> entityList = jdbcTemplate.query(SELECT_QUERY,rowMapper);
        return entityList;
    }


    public T getByID(int id){
        T entity = (T)jdbcTemplate.queryForObject(SELECT_BY_ID_QUERY+id,rowMapper);
        return entity;
    }

    public void create(T entity){

        Class<T> tClass =(Class<T>)
                ((ParameterizedType)getClass().getGenericSuperclass())
                        .getActualTypeArguments()[0];
        String query ="INSERT INTO ";
        Annotation[] declaredAnnotations = tClass.getDeclaredAnnotations();

        for (Annotation declaredAnnotation : declaredAnnotations) {
            if(declaredAnnotation.annotationType().getName().equals("com.durumluemrullah.demoSpringJdbc.annotations.Table")){
                query+= ((Table)declaredAnnotation).name() + "(";
            }
        }

        Field[] declaredFields1 = tClass.getDeclaredFields();
        for (Field field : declaredFields1) {
            Annotation[] declaredAnnotations1 = field.getDeclaredAnnotations();

            for (Annotation annotation : declaredAnnotations1) {
                if(annotation.annotationType().getName().equals("com.durumluemrullah.demoSpringJdbc.annotations.Collumn")){
                    query+="\""+ ((Collumn)annotation).name() +"\",";
                }
            }

        }
        int lastCamma = query.lastIndexOf(",");
        query = query.substring(0,lastCamma);
        query =query+") VALUES (";

        for (Field field : declaredFields1) {
            Annotation[] declaredAnnotations1 = field.getDeclaredAnnotations();
            for (Annotation annotation : declaredAnnotations1) {
                if(annotation.annotationType().getName().equals("com.durumluemrullah.demoSpringJdbc.annotations.Collumn")){
                    query+=":"+((Collumn)annotation).name() +",";
                }
            }
        }

        lastCamma = query.lastIndexOf(",");
        query = query.substring(0,lastCamma);
        query+=")";

        HashMap<String,Object> paramMap =new HashMap<>();

        for (Field field : declaredFields1) {
            field.setAccessible(true);
            Annotation[] declaredAnnotations1 = field.getDeclaredAnnotations();
            for (Annotation annotation : declaredAnnotations1) {
                if(annotation.annotationType().getName().equals("com.durumluemrullah.demoSpringJdbc.annotations.Collumn")){
                    try {
                        paramMap.put (((Collumn)annotation).name(),field.get(entity));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        namedParameterJdbcTemplate.execute(query, paramMap, new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement preparedStatement) throws SQLException, DataAccessException {
                return preparedStatement.executeUpdate();
            }
        });


    }

    public void delete(int id){
        String sql = DELETE_QUERY+id;
        jdbcTemplate.execute(sql);
    }

}
