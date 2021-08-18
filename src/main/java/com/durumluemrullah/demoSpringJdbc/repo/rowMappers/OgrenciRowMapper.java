package com.durumluemrullah.demoSpringJdbc.repo.rowMappers;

import com.durumluemrullah.demoSpringJdbc.model.Ogrenci;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OgrenciRowMapper implements RowMapper<Ogrenci> {
    @Override
    public Ogrenci mapRow(ResultSet resultSet, int i) throws SQLException {
        Ogrenci ogrenci=new Ogrenci();
        ogrenci.setId(resultSet.getInt(1));
        ogrenci.setOgrenciNum(resultSet.getInt(2));
        ogrenci.setOgrName(resultSet.getString(3));
        return ogrenci;
    }
}
