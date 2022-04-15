package com.example.myquery.web;

import com.example.myquery.entity.Dog;
import com.example.myquery.resolver.DogQuery;
import com.example.myquery.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogRouter {


    private DogService dogService;
    private DogQuery dogquery;

    @Autowired
    public void SetDogService(DogService dogService){
        this.dogService = dogService;
    }

    @GetMapping("/dogs")
    public ResponseEntity<List<Dog>> dogsRoute(){
        List<Dog> allDogs = dogService.allDogs();
        return new ResponseEntity<List<Dog>>(allDogs, HttpStatus.OK);
    }

    @PostMapping("/graphdog")
    public Iterable<Dog> queryDog(@RequestBody String query){
        return dogquery.getAllDogs();
    }
}
