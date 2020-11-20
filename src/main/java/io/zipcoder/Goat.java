package io.zipcoder;

public class Goat extends Pet{

    public Goat(){
        this.name = "Goat name";
        this.age = 0;
    }

    public Goat(String name){
        super(name);
        this.age = 0;
    }

    public Goat(Integer age){
        super(age);
        this.name = "Goat name";
    }

    public Goat(String name, Integer age){
        super(name, age);
    }

    public String speak() {
        return "Baaa";
    }
}
