public class SimpleMethodExample {
    //s is a method
    static void greet() {
        System.out.println("Hello! Welcome to Java methods");
    }
    public static void main(String[] args){
        greet();
        greet();
    }
}
//static void greet() → Method named greet, doesn't return anything.
//
//        System.out.println(...) → Code inside the method.
//
//greet(); → Calls the method.