package io.zipcoder;

public class Dog extends Pet {

    public Dog(){
        this.name = "Dog name";
        this.age = 0;
    }

    public Dog(String name){
        super(name);
        this.age = 0;
    }

    public Dog(Integer age){
        super(age);
        this.name = "Dog name";
    }

    public Dog(String name, Integer age){
        super(name, age);
    }

    @Override
    public String speak() {
        return "Woof";
    }
}
