import java.util.Scanner;
public class NameCheckExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = input.nextLine();

        if (name.equalsIgnoreCase("Shreejata")) {
            System.out.println("Welcome back, Shreejata!");
        } else {
            System.out.println("Hello," + name + "!");
        }
        input.close();

    }
}
