
package io.zipcoder;
import java.util.ArrayList;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        Prompts prompt = new Prompts();
        prompt.promptUserNumOfPets();
        for (int i = 1; i<= prompt.getNumOfPets();i++) {
            prompt.promptUserPetType();
            prompt.promptUserPetName();
        }
        prompt.printListSort2();
    }
}
