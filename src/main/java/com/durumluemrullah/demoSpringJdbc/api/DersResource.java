package com.durumluemrullah.demoSpringJdbc.api;

import com.durumluemrullah.demoSpringJdbc.model.Ders;
import com.durumluemrullah.demoSpringJdbc.repo.DersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/ders")
public class DersResource extends BaseApı<Ders>{

    @Autowired
    public DersResource(DersRepository dersRepository){
        super(dersRepository);
    }
}
