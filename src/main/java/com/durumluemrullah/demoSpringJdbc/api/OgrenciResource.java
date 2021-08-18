package com.durumluemrullah.demoSpringJdbc.api;


import com.durumluemrullah.demoSpringJdbc.model.Ogrenci;
import com.durumluemrullah.demoSpringJdbc.repo.OgrenciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/ogrenci")
public class OgrenciResource extends BaseApı<Ogrenci> {


    @Autowired
    public OgrenciResource(OgrenciRepository ogrenciRepository){
        super(ogrenciRepository);
    }


//    @GetMapping(path = "/getAll")
//    public List<Ogrenci> getAll() {
//        return ogrenciRepository.getAll();
//    }

  /*  @GetMapping(path = "/getById/{id}")
    public Ogrenci getById(@PathVariable(name = "id") int id) {
        return ogrenciRepository.getByID(id);
    }

    @PostMapping(path = "/createOgrenci", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String createOgrenci(@RequestBody Ogrenci ogrenci) {
        ogrenciRepository.create(ogrenci);
        return "eklendi";
    }

    @PostMapping(path = "/deleteById/{id}")
    public String deleteOgrenciById (@PathVariable(name ="id") int id){
        ogrenciRepository.delete(id);
        return "Silindi";
    }

    @PostMapping(path = "/createOgretmen", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String createOgretmen(@RequestBody Ogretmen ogretmen) {

        ogretmenRepository.create(ogretmen);
        return "eklendi";
    }
    @GetMapping(path = "/getAllOgretmen")
    public List<Ogretmen> getAllOgretmen() {
        return ogretmenRepository.getAll();
    }
*/
}