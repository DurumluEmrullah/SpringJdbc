package com.durumluemrullah.demoSpringJdbc.repo.rowMappers;

import com.durumluemrullah.demoSpringJdbc.model.Konu;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class KonuRowMapper implements RowMapper<Konu> {

    @Override
    public Konu mapRow(ResultSet resultSet, int i) throws SQLException {
        Konu konu = new Konu();
        konu.setKonuId(resultSet.getInt("KONU_ID"));
        konu.setKonu(resultSet.getString("KONU"));
        return konu;
    }
}
