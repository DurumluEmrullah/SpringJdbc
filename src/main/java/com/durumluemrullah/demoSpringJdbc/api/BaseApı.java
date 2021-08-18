package com.durumluemrullah.demoSpringJdbc.api;

import com.durumluemrullah.demoSpringJdbc.repo.BaseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


public class BaseApı<T> {

    private BaseRepository baseRepository;


    public BaseApı(BaseRepository baseRepository) {
        this.baseRepository = baseRepository;
    }
    @GetMapping(path = "/getAll")
    public ResponseEntity<List<T>> getAll(){
        return new ResponseEntity<>(baseRepository.getAll(), HttpStatus.OK);
    }

    @PostMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> createOgrenci(@RequestBody T entity) {
        baseRepository.create(entity);
        return new ResponseEntity<>("Başarılı",HttpStatus.OK);
    }

    @GetMapping(path = "/getById/{id}")
    public ResponseEntity<T> getById(@PathVariable(name = "id") int id) {
        return new ResponseEntity<>((T)baseRepository.getByID(id),HttpStatus.OK);
    }


    @PostMapping(path = "/deleteById/{id}")
    public ResponseEntity<Object> deleteOgrenciById (@PathVariable(name ="id") int id){
        baseRepository.delete(id);
        return new ResponseEntity<>("Silindi",HttpStatus.OK);
    }

}
