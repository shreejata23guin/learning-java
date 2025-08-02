package movie;

public class Booking {
    String customerName;
    String movieTitle;
    String paymentMode;

    //Constructor
    public Booking(String customerName,String movieTitle,String paymentMode){
        this.customerName=customerName;
        this.movieTitle=movieTitle;
        this.paymentMode=paymentMode;
    }
//        show booking details
    public void showBooking(){
        System.out.println("\n Booking Confirmed!");
        System.out.println("Customer Name:"+customerName);
        System.out.println("Movie Booked:"+movieTitle);
        System.out.println("Payment Mode:"+paymentMode);
    }


}

//customerName, movieTitle, paymentMode: stores info from user
//
//Constructor: saves booking info
//
//showBooking(): prints out the ticket details

