package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prompts {
    private Integer numOfPets;
    private Class cls;
    private Pet pet;

    public Prompts(){
        pet = new Pet();
    }

/*    public void addPet(Pet pet){
        petList.add(pet);
    }*/

/*    public ArrayList<Pet> getPets(){
        return petList;
    }*/

    public Integer getNumOfPets(){
        return numOfPets;
    }

    public String readInput(){
        Scanner prompt = new Scanner(System.in);
        return prompt.nextLine();
    }

    public Class getCls(){
        return cls;
    }

    public void promptUserNumOfPets(){
            System.out.println("Please enter number of pets you own.");
        while(true){ //separate the code inside the while loop from this method for testing
            // then call that method from this method, testing can't handle infinite loops;
            String userInput = this.readInput();
            try {
                if (Integer.parseInt(userInput, 10) >= 0) {
                    numOfPets = Integer.parseInt(userInput, 10);
                    break;
                } else {
                    System.out.println("Please enter a positive number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    public void promptUserPetType() {
        String path = "io.zipcoder.";
        System.out.println("Please enter pet type.");
        while(true) {
            String userInputPetType = this.readInput();
            String capType = userInputPetType.substring(0, 1).toUpperCase() + userInputPetType.substring(1, userInputPetType.length());

            try {
                cls = Class.forName(path + capType);
                break;
            } catch (ClassNotFoundException e) {
                System.out.println("Please enter a valid pet type, limited to only Dog, Cat, or Goat.");
            }
        }
    }

    public void promptUserPetName() {
        System.out.println("Please enter pet name.");
        while(true) {
            String userInputPetName = this.readInput();
            try {
                Object obj = cls.newInstance();
                Pet myPet = ((Pet) (obj)); //wrap general object with 'Pet' type object
                myPet.setName(userInputPetName);
                pet.addPet(myPet);
                break;
            } catch (InstantiationException | IllegalAccessException e) {
                System.out.println("uh-oh, your pet is illegal");
            }
        }
    }

    public void printList(){
        String pets = "Your pets are:\n";
        for(Pet x : pet.getPetList()){
            pets+=x.getName() + " speaks " + x.speak() + "\n";
        }
    System.out.println(pets);
    }

    public void printListSort1(){
        String pets = "Your pets are:\n";
        for(Pet x : pet.sortList1(pet.getPetList())){
            pets+=x.getName() + " speaks " + x.speak() + "\n";
        }
        System.out.println(pets);
    }

    public void printListSort2(){
        String pets = "Your pets are:\n";
        for(Pet x : pet.sortList2(pet.getPetList())){
            pets+=x.getName() + " speaks " + x.speak() + "\n";
        }
        System.out.println(pets);
    }

    public Pet getPet(){
        return pet;
    }

}
