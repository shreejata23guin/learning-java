package OOP_Inheritance;

public class Dog extends Animal{

    String breed;
//    Dog constructor
    Dog(String name,String breed){
        super(name);
        this.breed=breed;
        System.out.println("Dog constructor called");
    }
    void bark(){
        System.out.println(name+"says Woof!");
    }
    public static void main(String[]args){
        Dog d= new Dog("Tommy","Labrador");

        d.makeSound();
        d.bark();
    }
}

//| Line                 | Meaning                        |
//        | -------------------- | ------------------------------ |
//        | `Dog extends Animal` | Dog **inherits** from Animal   |
//        | `d.name = "Tommy"`   | Inherited variable from Animal |
//        | `d.makeSound()`      | Inherited method               |
//        | `d.bark()`           | Dog’s own method               |


//| Line                  | Meaning                           |
//        | --------------------- | --------------------------------- |
//        | `super(name);`        | Calls the constructor of `Animal` |
//        | `this.breed = breed;` | Sets Dog's own property           |
//        | `makeSound()`         | Inherited method from `Animal`    |
//        | `bark()`              | Dog's own method                  |
//
