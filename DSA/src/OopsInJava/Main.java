package OopsInJava;
import java.util.Optional;

//Like array is a DataType which stores similar Datatypes and Wea re now creating a dataType of name Student which can have other data types too

// Remember Array :- When you want to stores same data type
//Class :- When you want  to stores multiple dataTypes

public class Main {
    public static class Student{    //Basically we are a Data Type of name Student
        String name;
        int rollNo;
        double per;
    }
    public static void main(String[] args){
        Student x=new Student();            //Decleration
        x.name="JATIN VAID";                //Initialization
        x.rollNo=108;
        x.per=94.8;

        System.out.println(x.name);
    }
}


//Access Modifiers

//Public: all packages
//Private: same Class
//Default: same package



