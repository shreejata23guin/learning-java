package movie;

public class Movie {
    String title;
    double price;

    //Constructor
    public Movie(String title,double price){
        this.title=title;
        this.price=price;
    }
    //Display movie info
    public void display() {
        System.out.println("Movie:" + title + "| Price:₹" + price);
    }
    }


//String title, double price → store movie name and ticket price
//
//Constructor → assigns values when a Movie is created
//
//display() → prints the movie info