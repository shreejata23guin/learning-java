package OOP_Encapsulation;

public class Student {
    //private data
    private String name;
    private int age;

    //public getter for name

    public String getName() {
        return name;
    }

    //public setter for name

    public void setName(String name) {
        this.name = name;
    }
    //public getter for age

    public int getAge() {
        return age;
    }

    //public setter for age

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

public static void main(String[]args){
    Student s=new Student();
    s.setName("Shreejata");
    s.setAge(20);

    System.out.println("Name:"+s.getName());
    System.out.println("Age:"+s.getAge());
    }
}



//| Line                       | What it does                             |
//| -------------------------- | ---------------------------------------- |
//| `private String name`      | Makes variable hidden from other classes |
//| `public void setName(...)` | Allows setting the value from outside    |
//| `public String getName()`  | Allows reading the value                 |
//| `setAge()` has logic       | Protects from setting invalid data       |