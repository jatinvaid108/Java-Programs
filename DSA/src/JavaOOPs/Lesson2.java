package JavaOOPs;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println(" ");
    }
}

//Constructor Chaining Using this keyword
class Student {
    String name;
    int age;

    Student() {
        this("Unknown", 0);
        System.out.println("Default constructor");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor");
    }
}

//Usage
//Student s1 = new Student();

//Output
//Parameterized constructor
//Default constructor

//Why?
//
//Because:
//        this("Unknown", 0);
//calls the parameterized constructor first.
//
//🔥 Important Rule
//
//⚠️ this() must be the first statement inside constructor.

