package input;
import java.util.Scanner;
public class ScannerExample {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name=sc.nextLine();

        System.out.print("Enter your age:");
        int age=sc.nextInt();

        System.out.print("Enter your score percentage");
        double percentage=sc.nextDouble();

        System.out.println("Enter your grade (A/B/C):");
        char grade = sc.next().charAt(0);

        sc.close();

        System.out.println("\n---Student Details---");
        System.out.println("Name:"+ name);
        System.out.println("Age:"+age);
        System.out.println("Percentage:"+percentage);
        System.out.println("Grade:"+grade);

        int roundedPercentage=(int) percentage;
        System.out.println("Rounded Percentage:"+roundedPercentage);
    }
}
