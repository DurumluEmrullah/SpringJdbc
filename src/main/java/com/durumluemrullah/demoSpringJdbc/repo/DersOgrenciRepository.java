package com.durumluemrullah.demoSpringJdbc.repo;

import com.durumluemrullah.demoSpringJdbc.model.DersOgranci;
import com.durumluemrullah.demoSpringJdbc.repo.rowMappers.DersOgrenciRowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class DersOgrenciRepository extends BaseRepository<DersOgranci> {


    private static final String SELECT_QUERY ="SELECT * FROM \"OBS\".\"DERS_OGRENCI\"";
    private static final String SELECT_BY_ID_QUERY="SELECT * FROM \"OBS\".\"DERS_OGRENCI\" WHERE \"KAYIT_ID\" = ";
    private static final String DELETE_QUERY="DELETE FROM \"OBS\".\"DERS_OGRENCI\" WHERE \"KAYIT_ID\" =";

    public DersOgrenciRepository() {
        super(SELECT_QUERY, SELECT_BY_ID_QUERY, DELETE_QUERY,new DersOgrenciRowMapper());
    }
}
