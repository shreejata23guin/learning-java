package OOP_Polymorphism;

public class Calculator {
    //add with 2 ints
    int add(int a,int b){
        return a+b;
    }
    //add with 3 ints
int add(int a,int b,int c){
        return a+b+c;
}
public static void main(String[] args){
        Calculator calc=new Calculator();
        System.out.println("2 numbers"+calc.add(5,10));
        System.out.println("3 numbers:"+calc.add(1,2,3));
}

}
