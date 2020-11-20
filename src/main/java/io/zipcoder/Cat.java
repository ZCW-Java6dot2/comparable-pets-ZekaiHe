package io.zipcoder;

public class Cat extends Pet{

    public Cat(){
        this.name = "Cat name";
        this.age = 0;
    }

    public Cat(String name){
        super(name);
        this.age = 0;
    }

    public Cat(Integer age){
        super(age);
        this.name = "Cat name";
    }

    public Cat(String name, Integer age){
        super(name, age);
    }

    @Override
    public String speak() {
        return "Meow";
    }
}
