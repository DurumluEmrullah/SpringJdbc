package com.durumluemrullah.demoSpringJdbc.repo.rowMappers;

import com.durumluemrullah.demoSpringJdbc.model.Ogretmen;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OgretmenRowMapper implements RowMapper<Ogretmen> {
    @Override
    public Ogretmen mapRow(ResultSet resultSet, int i) throws SQLException {
        Ogretmen ogretmen = new Ogretmen();
        ogretmen.setOgrId(resultSet.getInt(1));
        ogretmen.setOgrName(resultSet.getString(2));

        return ogretmen;
    }
}
