package com.durumluemrullah.demoSpringJdbc.repo;

import com.durumluemrullah.demoSpringJdbc.model.Ders;
import com.durumluemrullah.demoSpringJdbc.repo.rowMappers.DersRowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class DersRepository extends BaseRepository<Ders> {

    private static final String SELECT_QUERY ="SELECT * FROM \"OBS\".\"DERS\"";
    private static final String SELECT_BY_ID_QUERY="SELECT * FROM \"OBS\".\"DERS\" WHERE \"DERS_ID\" = ?";
    private static final String DELETE_QUERY="DELETE FROM \"OBS\".\"DERS\" WHERE \"DERS_ID\" =";

    public DersRepository() {
        super(SELECT_QUERY, SELECT_BY_ID_QUERY, DELETE_QUERY,new DersRowMapper());
    }
}
