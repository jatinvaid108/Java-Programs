package Recursion;
import java.util.Scanner;
public class Class1 {
    static int count=0;
    static void functCount(){
        if(count==4) return;
        System.out.println(count);
        count++;
        functCount();
    }

    public static void main(String[] args){
        functCount();
    }
}


//Print the Name N times with Recursion

class NamePrinting{
    static void funcName(int i,int n){
        if(i>n) return;
        System.out.println("Jatin Vaid");
        funcName(i+1,n);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter N times you like to Print Names ");
        int n=input.nextInt();
        funcName(1,n);
    }
}

//Print the N number Linerly

class Nnumbers{
    static void printNum(int i,int n){
        if(i>n) return ;
        System.out.println(i);
        printNum(i+1,n);
    }

    public static void main(String[] args) {
        System.out.println("Enter N number you like to print ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        printNum(1,n);
    }
}


// Print the N numbers in reverse order

class ReverseNum{
    static void reverseNum(int i,int n){
        if(i<1) return;
        System.out.println(i);
        reverseNum(i-1,n);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the N: ");
        int n=input.nextInt();
        reverseNum(n,n);
    }
}

//Print the Numbers 1 to N using the Backtracking
class backTrack{
    static void Nprint(int i,int n){
        if(i<1) return;
        Nprint(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the N: ");
        int n=input.nextInt();
        Nprint(n,n);
    }
}

//Print the Numbers N to 1 using the Backtracking\

class backtrack{
    static void reverseBack(int i, int n){
        if(i>n) return;
        reverseBack(i+1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the N: ");
        int n=input.nextInt();
        reverseBack(1,n);
    }
}