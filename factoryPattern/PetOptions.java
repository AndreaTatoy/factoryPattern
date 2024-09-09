package factoryPattern;

import java.util.Scanner;

public class PetOptions {

  public static void main(String{} args){
    Scanner scan = new Scanner(System.in);
    Pet cat = new Cat();
    ((Cat)cat).setNoOfLives(9);

    Pet dog - new Dog();
    ((Dog)dog).setBreed("Golden Retriever");

    while(true){
      System.out.println("PLEASE SELECT" +
                        "\n   1. Cat" +
                        "\n   2. Dog" +
                        "\n   3. Exit" +
                         "\nEnter the number of your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Cat selectedCat = (Cat) cat;
                    System.out.println("Number of lives: " + selectedCat.getNoOfLives());
                    break;
                case 2:
                    Dog selectedDog = (Dog) dog;
                    System.out.println("Breed: " + selectedDog.getBreed());
                    break;
                case 3:
                    System.out.println("Programmer: Louise Andrea R. Tatoy" + 
                                       "\nExiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid. Please enter only numbers 1, 2, or 3.");
            }
        }
    }
}
