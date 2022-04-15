package com.example.myquery.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.myquery.entity.Dog;
import com.example.myquery.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DogQuery implements GraphQLQueryResolver {
    @Autowired
    private final DogRepository dogRepository;

    public DogQuery(DogRepository dogRepository){
        this.dogRepository = dogRepository;
    }

    public Iterable<Dog> getAllDogs(){
        return dogRepository.findAll();
    }
}
