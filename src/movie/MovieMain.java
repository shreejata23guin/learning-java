package movie;

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //create some movies
        Movie m1 = new Movie("Avengers", 250);
        Movie m2 = new Movie("Inception", 200);
        Movie m3 = new Movie("3 idiots", 150);

        System.out.println("\uD83C\uDFAC Welcome to Movie Ticket Booking System");
        System.out.println("Available Movies:");
        m1.display();
        m2.display();
        m3.display();
        //user input
        System.out.print("\nEnter your name:");
        String name = sc.nextLine();

        System.out.print("Choose movie(1/2/3):");
        int choice = sc.nextInt();
        sc.nextLine(); //consume newline

        String selectedMovie = "";
        if (choice == 1) {
            selectedMovie = m1.title;
        } else if (choice == 2) {
            selectedMovie = m2.title;
        } else if (choice == 3) {
            selectedMovie = m3.title;
        } else {
            System.out.println("Invalid choice!Exiting.");
            return;
        }

        //Payment option
        System.out.print("Pay Online or Offline?");
        String payment = sc.nextLine();
        //create booking
        Booking b1 = new Booking(name, selectedMovie, payment);
        b1.showBooking();
    }
}


//| Line            | Explanation                |
//        | --------------- | -------------------------- |
//        | `Scanner sc`    | Take user input            |
//        | `Movie m1...`   | Create 3 movie objects     |
//        | `display()`     | Show movie names and price |
//        | `choice`        | User selects a movie (1–3) |
//        | `if-else`       | Get movie name from choice |
//        | `payment`       | User types online/offline  |
//        | `Booking`       | Object stores booking info |
//        | `showBooking()` | Displays final receipt     |
//
