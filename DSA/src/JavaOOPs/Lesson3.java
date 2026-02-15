package JavaOOPs;

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println(" ");
    }
}



//Super Keyword coding Implementation
class Person {
    String name;

    Person(String name) {
        this.name = name;
        System.out.println("Person constructor");
    }
}

class Student extends Person {
    int age;

    Student(String name, int age) {
        super(name);  // Calling parent constructor
        this.age = age;
        System.out.println("Student constructor");
    }
}


//Usage
//Student s1 = new Student("Jatin", 20);

//Output
//Person constructor
//Student constructor


//🧠 What is happening?
//
//When Student object is created:
//
//1️⃣ Parent constructor runs first
//2️⃣ Then child constructor runs





//---------------------------------------------------------->

//Example Without Writing super()

class A {
    A() {
        System.out.println("Constructor A");
    }
}

class B extends A {
    B() {
        System.out.println("Constructor B");
    }
}

class Main {
    public static void main(String[] args) {
        B obj = new B();
    }
}

//OUTPUT
//Constructor A
//Constructor B

//🧠 But Wait… We Did NOT Write super() 🤯
//
//Correct.
//
//But Java automatically inserts:


//
//🚨 Now Important Case (Interview Trap)
//
//What if parent constructor has parameters?
class A {
    A(int x) {
        System.out.println("Constructor A with x");
    }
}

class B extends A {
    B() {
        System.out.println("Constructor B");
    }
}


//Now what happens?
//
//        ❌ Compilation Error.
//
//Why?
//
//Because Java tries to insert:

//class B extends A {
//    B() {
//        super(10);   // We must call explicitly
//        System.out.println("Constructor B");
//    }
//}
