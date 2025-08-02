package methodExamples;

public class MethodWithParameters {
    static void greetUser(String name){
        System.out.println("Hello,"+name+"!");
    }
    public static void main(String[] args){
        greetUser("Shreejata");
        greetUser("Apu");
    }
}
