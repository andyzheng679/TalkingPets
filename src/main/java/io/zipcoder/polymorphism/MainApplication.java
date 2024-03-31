package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pet> pets = new ArrayList<>();

        System.out.println("How many pets do you have?");
        int numberOfPets = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("Enter the type of pet " + (i + 1) + ":");
            String type = scanner.nextLine().toLowerCase();
            System.out.println("What is the name of this " + type + "?");
            String name = scanner.nextLine();

            switch (type) {
                case "dog":
                    pets.add(new Dog(name));
                    break;
                case "cat":
                    pets.add(new Cat(name));
                    break;
                case "bird":
                    pets.add(new Bird(name));
                    break;
                default:
                    System.out.println("Unsupported pet type, please enter dog, cat, or bird.");
                    i--; // Ensures the user inputs a valid pet type
                    break;
            }
        }

        System.out.println("Here are the pets you have:");
        for (Pet pet : pets) {
            System.out.println(pet.getName() + " the " + pet.getClass().getSimpleName().toLowerCase() + " says " + pet.speak());
        }
    }
}
