package com.example.myquery.mutator;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.myquery.entity.Dog;
import com.example.myquery.exception.DogNotFoundException;
import com.example.myquery.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private final DogRepository dogRepository;

    public Mutation(DogRepository dogRepository){
        this.dogRepository = dogRepository;
    }

    public Dog newDog(String name, String modal){
        Dog newDOg = new Dog(name, modal);
        dogRepository.save(newDOg);
        return newDOg;
    }

    public Boolean deleteDog(Long id){
        dogRepository.deleteById(id);
        return true;
    }

    public Dog updateDogName(String newName, Long dogId){
        Optional<Dog> optionalDogDog = dogRepository.findById(dogId);
        if (optionalDogDog.isPresent()) {
            Dog foundDog = optionalDogDog.get();
            foundDog.setName(newName);
            dogRepository.save(foundDog);
            return foundDog;
        } else {
            throw new DogNotFoundException("Sorry We could not find the selected Dog It maybe removed ID: ", dogId);
        }

    }
}
