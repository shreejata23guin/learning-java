package switchExamples;

import java.util.Scanner;

public class DaySwitchExample {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.print("Enter a number(1 to 7):");
        int day= input.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number! Enter between 1 and 7.");
        }
        input.close();
    }
}


//import java.util.Scanner;	This allows us to use the Scanner class to take user input.
//public class DaySwitchExample {	Start of your Java class named DaySwitchExample.
//    public static void main(String[] args) {	This is the main method where your program starts running.
//        Scanner input = new Scanner(System.in);	Creates a Scanner object named input to read input from keyboard.
//                System.out.print("Enter a number (1 to 7): ");	Prints a message asking the user to enter a number.
//        int day = input.nextInt();	Reads an integer from user and stores it in variable day.
//        switch (day) {	Begins the switch block to check value of day.
//            case 1: to case 7:	If day is 1, it prints "Monday", if 2 → "Tuesday", etc.
//                break;	Stops checking further cases once a match is found.
//            default:	If none of the above matches, this runs (used for invalid input).
//                input.close();	Closes the input scanner to free memory.


//Use switch when there are multiple exact values to check
//
//Each case checks a specific value
//
//break prevents checking the next case
//
//default is like else