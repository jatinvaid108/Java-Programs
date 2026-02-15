package JavaOOPs;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println(" ");
    }
}

class Car{
    String brand;
    int price;

    void drive(){
        System.out.println(brand +" is driving");
    }
    public static void main(String[] args){
        Car c1=new Car();
        Car c2=new Car();

        c1.brand="AUDI";
        c1.price=6000000;

        c2.brand="BMW";
        c2.price=9000000;

        c1.drive();
        c2.drive();
    }
}


//Constructor Overloading Example

class Student {
    String name;
    int age;

    // Constructor 1
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Constructor 2
    Student(String name) {
        this.name = name;
        age = 0;
    }

    // Constructor 3
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}


//Usage
//Student s1 = new Student();
//Student s2 = new Student("Jatin");
//Student s3 = new Student("Rahul", 21);


