import java.util.Scanner;
import java.util.*;
public class Questions {
    public static void main(String[] args){
        //Reversing a Number
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int reversed=0;
        while(num!=0){
            int last_digit=num%10;
            reversed*=10;
            reversed+=last_digit;
            num/=10;
        }
        System.out.println("The reverse of Number "+num+" is "+reversed);
    }
}


class Armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isArmstrong(num)){
            System.out.println("The number "+num+" is an armstrong number");
        }
         else{
             System.out.println("The number "+num+" is not an Armstrong number ");
        }
    }

    static boolean isArmstrong(int num){
        int original_num=num;
        int sum=0;
        int length=String.valueOf(num).length();
        while(num!=0){
            int last_digit=num%10;
            sum+=Math.pow(last_digit,length);
            num/=10;
        }
//        return original_num==sum;
        if(original_num==sum) return true;
        return false;

    }
}

class fibonacci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("The fibonacci Series upto "+ n+ " Series is");
        fibonacci_series(n);
    }

    static void fibonacci_series(int num){
        int first=0,second=1;
        for(int i=1;i<=num;i++){
            System.out.print(first+" ");
            int next_term=first+second;
            first=second;
            second=next_term;
        }
    }
}


//Last time you got this in end term and you did it wrong :-

//Write a Java program that reads an integer input from the user and determines the largest digit in the number. The program should display the largest digit and then print the corresponding word representation of that digit (e.g., "One", "Two", "Three", etc.). If the largest digit is not handled in the `switch` cases, output a default message.

// For example:
// - Input: 374
// - Output: The largest digit is 7, and it should print "Seven".

class largest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int largest=0;
        while(num!=0){
            int last_digit=num%10;
            if(last_digit>largest) largest=last_digit;
            num/=10;
        }
        System.out.println(largest);

        switch (largest){
            case 1: System.out.println("one");
            break;
            case 2: System.out.println("Two");
            break;
            case 3: System.out.println("Three");
            break;
            case 4: System.out.println("Four");
            break;
            case 5: System.out.println("Five");
            break;
            case 6: System.out.println("Six");
            break;
            case 7: System.out.println("Seven");
            break;
            case 8: System.out.println("Eight");
            break;
            case 9: System.out.println("Nine");
            break;
            case 10: System.out.println("Ten");
            break;
            default: System.out.println("Invalid Number ");
        }
    }
}


class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];


        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        int target = input.nextInt();


        int index = linearSearch(arr, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

    }


    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}




class LinearSearchRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take array size input
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        // Take array elements input
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        // Take target element input
        System.out.print("Enter the target element to search: ");
        int target = input.nextInt();

        // Perform recursive linear search
        int index = linearSearch(arr, target, 0);

        // Print result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }

        input.close();
    }

    // Recursive function for linear search
    public static int linearSearch(int[] arr, int target, int index) {
        // Base case: if index reaches array length, return -1 (element not found)
        if (index == arr.length) {
            return -1;
        }
        // If target is found at the current index, return the index
        if (arr[index] == target) {
            return index;
        }
        // Recursive call to check the next index
        return linearSearch(arr, target, index + 1);
    }
}



class TwoDimensionalLinearSearch {
    static String linearSearch(int[][] matrix, int rows, int cols, int target) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == target) {
                    return i + " " + j;
                }
            }
        }
        return "-1 -1";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int cols = input.nextInt();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int target = input.nextInt();
        input.close();

        System.out.println(linearSearch(matrix, rows, cols, target));
    }
}



class MajorityElement {
    public static int findMajorityElement(int[] arr) {
        int count;
        for(int i=0;i<arr.length;i++){
            count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>arr.length/2){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Example Test Case
        int[] arr = {1,2,3,4,5,6,7};

        // Calling function
        int result = findMajorityElement(arr);

        // Output the result
        System.out.println("Majority Element: " + result);
    }
}





