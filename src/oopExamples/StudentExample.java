package oopExamples;

public class StudentExample {
    public static void main(String[]args){
        //create object of student
        Student s1=new Student();
        //set values
        s1.name="Shreejata";
        s1.age=20;
//        call method
        s1.displayInfo();
    }
}

//| Line                          | Meaning                                  |
//        | ----------------------------- | ---------------------------------------- |
//        | `public class Student`        | This is your blueprint/class             |
//        | `String name; int age;`       | These are variables of each student      |
//        | `void displayInfo()`          | This method prints info                  |
//        | `Student s1 = new Student();` | You create an object (s1) from the class |
//        | `s1.name = "Shreejata";`      | Set object values                        |
//        | `s1.displayInfo();`           | Call method using object                 |
