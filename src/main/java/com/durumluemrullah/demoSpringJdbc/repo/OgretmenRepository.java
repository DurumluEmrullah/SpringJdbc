package com.durumluemrullah.demoSpringJdbc.repo;

import com.durumluemrullah.demoSpringJdbc.model.Ogretmen;
import com.durumluemrullah.demoSpringJdbc.repo.rowMappers.OgretmenRowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class OgretmenRepository extends BaseRepository<Ogretmen> {

    private static final String SELECT_QUERY ="SELECT * FROM \"OBS\".\"OGRETMEN\"";
    private static final String SELECT_BY_ID_QUERY="SELECT * FROM \"OBS\".\"OGRETMEN\" WHERE \"OGR_ID\" = ";
    private static final String DELETE_QUERY="DELETE FROM \"OBS\".\"OGRETMEN\" WHERE \"OGR_ID\" =";



    public OgretmenRepository() {
        super(SELECT_QUERY, SELECT_BY_ID_QUERY, DELETE_QUERY, new OgretmenRowMapper());
    }
}
