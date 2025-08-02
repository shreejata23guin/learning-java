package constructorExamples;

public class Student {
    String name;
    int age;
//    constructor
    Student(String n,int a){
        name=n;
        age=a;
    }
//    method to display info
    void displayInfo(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
