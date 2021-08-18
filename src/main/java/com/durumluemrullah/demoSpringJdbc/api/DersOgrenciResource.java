package com.durumluemrullah.demoSpringJdbc.api;

import com.durumluemrullah.demoSpringJdbc.model.DersOgranci;
import com.durumluemrullah.demoSpringJdbc.repo.DersOgrenciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/dersOgrenci")
public class DersOgrenciResource  extends BaseApı<DersOgranci> {

    @Autowired
    public DersOgrenciResource(DersOgrenciRepository dersOgrenciRepository){
        super(dersOgrenciRepository);
    }
}
