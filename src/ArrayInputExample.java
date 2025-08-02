import java.util.Scanner;
public class ArrayInputExample {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        int[] marks=new int[5];
        System.out.println("Enter 5 marks:");
        for (int i=0;i< marks.length;i++){
            System.out.print("Mark"+ (i+1)+":");
            marks[i]=input.nextInt();
        }
        System.out.println("You entered:");
        for (int mark: marks){
            System.out.println(mark);
        }
        input.close();
    }
}
