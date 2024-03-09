package org.nau.Task1;

import java.util.ArrayList;
import java.util.List;

public class AnimalService {
    int count = 0;
    List<Animal> animalList = new ArrayList<>();
    public Animal createAnimal(String name, int age, String type, String ownersName){
        count++;
        return new Animal(count, type, age, name, ownersName);
    }
}
