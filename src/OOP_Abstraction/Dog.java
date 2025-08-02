package OOP_Abstraction;

 class Dog implements Animal {
     public void sound(){
         System.out.println("Dog barks");
     }

     public static void main(String[] args){
         Dog d= new Dog();
         d.sound();
     }
}

//| Concept           | Purpose             |
//| ----------------- | ------------------- |
//| `abstract class`  | Partial abstraction |
//| `interface`       | Full abstraction    |
//| `abstract method` | Must be overridden  |