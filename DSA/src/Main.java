import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Shifting Negative Numbers while preserving the order
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        negativeShift(arr);
    }

    static void negativeShift(int[] arr){
        int n=arr.length;
        int[] temp=new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }

//        System.arraycopy(temp, 0, arr, 0, n);

        // Print the final result
//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


class uniqueElement{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();

        System.out.println("Enter the Size of the Array :  ");
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            arr.add(input.nextInt());
        }

        UniqueEle(arr);
    }

    static void UniqueEle(ArrayList<Integer> arr){
        int n=arr.size();
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            if((i==0 || arr.get(i) != arr.get(i-1)) && (i==n-1 || arr.get(i) != arr.get(i+1))){
                temp.add(arr.get(i));
            }
        }
        System.out.print(temp+" ");

    }
}


class leftShift{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=input.nextInt();
        }
        leftShiftele(arr);
    }
    static void leftShiftele(int[] arr){
        int n=arr.length;
        int firstele=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=firstele;

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


class rightShift{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=input.nextInt();
        }
        rightShiftele(arr);
    }
    static void rightShiftele(int[] arr){
        int n=arr.length;
        int lastele=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=lastele;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}



