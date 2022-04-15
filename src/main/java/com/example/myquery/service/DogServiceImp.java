package com.example.myquery.service;

import com.example.myquery.entity.Dog;
import com.example.myquery.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImp implements DogService {
    @Autowired
    DogRepository dogRepository;

    public List<Dog> allDogs(){
        return (List<Dog>) dogRepository.findAll();
    }
}
