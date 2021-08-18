package com.durumluemrullah.demoSpringJdbc.repo.rowMappers;

import com.durumluemrullah.demoSpringJdbc.model.Ders;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DersRowMapper implements RowMapper<Ders> {
    @Override
    public Ders mapRow(ResultSet resultSet, int i) throws SQLException {

        Ders ders = new Ders();
        ders.setDersId(resultSet.getInt("DERS_ID"));
        ders.setKonuId(resultSet.getInt("KONU_ID"));
        ders.setOgretmenId(resultSet.getInt("OGRETMEN_ID"));
        return ders;
    }
}
