package com.durumluemrullah.demoSpringJdbc.repo;

import com.durumluemrullah.demoSpringJdbc.model.Ogrenci;
import com.durumluemrullah.demoSpringJdbc.repo.rowMappers.OgrenciRowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class OgrenciRepository  extends BaseRepository<Ogrenci> {

    private static final String SELECT_QUERY="SELECT * FROM \"OBS\".\"OGRENCI\"";
    private static final String SELECT_BY_ID_QUERY="SELECT * FROM \"OBS\".\"OGRENCI\" WHERE \"OGR_ID\" = ";
    private static final String DELETE_QUERY="DELETE FROM \"OBS\".\"OGRENCI\" WHERE \"OGR_ID\" =";



    public OgrenciRepository() {
        super(SELECT_QUERY, SELECT_BY_ID_QUERY, DELETE_QUERY, new OgrenciRowMapper());
    }

}
