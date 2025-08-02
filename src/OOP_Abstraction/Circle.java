package OOP_Abstraction;

 class Circle extends Shape {
     @Override
     void draw() {
         System.out.println("Drawing a Circle");
     }
     public static void main(String[] args){
         Shape s=new Circle();
         s.draw();
     }
 }

 //| Line                      | Purpose                                 |
//| ------------------------- | --------------------------------------- |
//| `abstract class Shape`    | Can’t be used directly                  |
//| `abstract void draw()`    | No body, must be implemented            |
//| `Circle extends Shape`    | Provides the actual `draw()` method     |
//| `Shape s = new Circle();` | Uses abstraction (hides how it’s drawn) |
