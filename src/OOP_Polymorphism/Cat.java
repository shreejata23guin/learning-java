package OOP_Polymorphism;

public class Cat extends Animal {
    @Override
    void sound(){
        System.out.println("Cat says Meow");
    }
    public static void main(String[]args){
        Animal a=new Cat(); //Parent reference,child object
        a.sound();//calls cat's version (not Animal's)
    }
}


//| Concept            | Example                                            |
//| ------------------ | -------------------------------------------------- |
//| Method Overloading | Same class, same method name, different parameters |
//| Method Overriding  | Child class modifies parent's method               |