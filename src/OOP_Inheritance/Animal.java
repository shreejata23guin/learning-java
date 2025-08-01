package OOP_Inheritance;

public class Animal {
    String name;
    //constructor
    Animal(String name){
        this.name=name;
        System.out.println("Animal constructor caleed");
    }

    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
