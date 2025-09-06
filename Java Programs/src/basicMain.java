//Remember to write a statemnets as if statements

import java.util.Scanner;                   //This will work for all classes

public class basicMain{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();
        int num4=input.nextInt();

        int largest=num1;
        if(num2>largest) largest=num2;
        if(num3>largest) largest=num3;
        if(num4>largest) largest=num4;

        System.out.println(largest);
    }
}


//Calculator Program


class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}


class prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean isprime=true;
        if(num<2){
            isprime=false;
        }
        else{
            for(int i=2;i*i<=num/2;i++){
                if(num%i==0){
                    isprime=false;
                    break;
                }
            }
        }


        if(isprime){
            System.out.println("The number "+num +" is prime ");
        }
        else{
            System.out.println("The number "+num +" is not prime");
        }
    }
}


class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;  // Skip when i is 3
            }
            System.out.println(i);
        }
    }
}



class multi{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int [][] matrix =new int[3][3];
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=input.nextInt();
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum+=matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
