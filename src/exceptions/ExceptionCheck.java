package exceptions;

import drivers.NoValidBrowserName;

import java.util.Scanner;

public class ExceptionCheck {

    public static void main(String[] args) throws InvalidAgeException {


        Scanner scan = new Scanner(System.in);
        System.out.println("Ile masz lat? Wpisz swój wiek: ");
        int age = scan.nextInt();
        if (age < 0){
            throw new InvalidAgeException("Your age is not valid.");
        }
        if ( age >= 18) {
            System.out.println("You can enter without any problems :)!");
        }
        else {
            System.out.println("You are too young to enter.");
        }
    }
}



