package com.durumluemrullah.demoSpringJdbc.repo;

import com.durumluemrullah.demoSpringJdbc.model.Konu;
import com.durumluemrullah.demoSpringJdbc.repo.rowMappers.KonuRowMapper;

import org.springframework.stereotype.Repository;

@Repository
public class KonuRepository extends BaseRepository<Konu> {

    private static final String SELECT_QUERY ="SELECT * FROM \"OBS\".\"KONU\"";
    private static final String SELECT_BY_ID_QUERY="SELECT * FROM \"OBS\".\"KONU\" WHERE \"KONU_ID\" = ";
    private static final String DELETE_QUERY="DELETE FROM \"OBS\".\"KONU\" WHERE \"KONU_ID\" =";

    public KonuRepository() {
        super(SELECT_QUERY, SELECT_BY_ID_QUERY, DELETE_QUERY,new KonuRowMapper());
    }
}
