package constructorExamples;

public class StudentConstructor {
    public static void main(String[] args){
        // create object with values
        Student s1=new Student("Shreejata",20);
        Student s2=new Student("Apu",25);

        s1.displayInfo();
        s2.displayInfo();
    }
}

//| Line                            | What It Means                                             |
//| ------------------------------- | --------------------------------------------------------- |
//| `Student(String n, int a)`      | Constructor — called automatically when object is created |
//| `name = n;` and `age = a;`      | Assign input values to the object's variables             |
//| `new Student("Shreejata", 20);` | You are passing name and age during object creation       |
//| `displayInfo()`                 | Prints values of the object
//
// | Without Constructor        | With Constructor                     |
//| -------------------------- | ------------------------------------ |
//| Set each value manually    | Set values while creating the object |
//| ❌ Can forget to set values | ✅ Forces setting all values at once  |
//| More code                  | Cleaner, shorter code                |