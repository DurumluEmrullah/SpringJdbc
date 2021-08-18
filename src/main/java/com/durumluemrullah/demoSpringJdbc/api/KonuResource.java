package com.durumluemrullah.demoSpringJdbc.api;

import com.durumluemrullah.demoSpringJdbc.model.Konu;
import com.durumluemrullah.demoSpringJdbc.repo.KonuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/konu")
public class KonuResource extends BaseApı<Konu>{

    @Autowired
    public KonuResource(KonuRepository konuRepository){
        super(konuRepository);
    }
}
