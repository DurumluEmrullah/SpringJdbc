package com.durumluemrullah.demoSpringJdbc.api;

import com.durumluemrullah.demoSpringJdbc.model.Ogretmen;
import com.durumluemrullah.demoSpringJdbc.repo.OgretmenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/ogretmen")
public class OgretmenResource extends BaseApı<Ogretmen> {

    @Autowired
    public OgretmenResource(OgretmenRepository ogretmenRepository){
        super(ogretmenRepository);
    }
}
