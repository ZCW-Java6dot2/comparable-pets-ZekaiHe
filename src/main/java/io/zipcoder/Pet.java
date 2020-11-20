package io.zipcoder;

import java.util.ArrayList;
import java.lang.Comparable;
import java.util.Collections;
import java.util.Comparator;

public class Pet implements Comparable<Pet>{
    String name;
    Integer age;
    ArrayList<Pet> petList = new ArrayList<>();

    public Pet(){
    }

    public Pet(String name){
        this.name = name;
    }

    public Pet(Integer age){
        this.age = age;
    }

    public Pet (String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public ArrayList<Pet> getPetList(){
        return petList;
    }

    public void addPet(Pet pet){
        petList.add(pet);
    }

    public Integer getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public String speak(){
        return "Pet speaks";
    }

    @Override
    public int compareTo(Pet o) {
        if(getName().compareTo(o.getName()) != 0){ //if not equal
            return getName().compareTo(o.getName()); //compare by name
        }
        else{ //if equal name, compare by class (lexicographically)
            return getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
        }
    }

    public ArrayList<Pet> sortList1(ArrayList<Pet> unsorted){
        Collections.sort(unsorted);
        return petList;
    }

    public ArrayList<Pet> sortList2(ArrayList<Pet> unsorted){
        Collections.sort(unsorted, new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                if(o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName()) != 0){ //if not equal o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName())
                    return o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName()); //compare by name
                }
                else{ //if equal name, compare by class (lexicographically)
                    return o1.getName().compareTo(o2.getName());
                }
        };
        });
        return petList;
    }

}
