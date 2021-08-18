package com.durumluemrullah.demoSpringJdbc.repo.rowMappers;

import com.durumluemrullah.demoSpringJdbc.model.DersOgranci;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DersOgrenciRowMapper implements RowMapper<DersOgranci> {
    @Override
    public DersOgranci mapRow(ResultSet resultSet, int i) throws SQLException {
        DersOgranci dersOgranci = new DersOgranci();
        dersOgranci.setKayitId(resultSet.getInt("KAYIT_ID"));
        dersOgranci.setOgrenciId(resultSet.getInt("OGRENCI_ID"));
        dersOgranci.setDersId(resultSet.getInt("DERS_ID"));

        return dersOgranci;
    }
}
