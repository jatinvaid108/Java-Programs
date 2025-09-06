import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        int num;
        Scanner input=new Scanner(System.in);
        num=input.nextInt();
        int ans=factorial(num);
        System.out.println("The Factorial of "+num+" is "+ans);
    }

   public static int factorial(int num){
        if(num==0||num==1){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
   }
}

class armstrong{
    public static  void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(isArmstrong(n)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    static boolean isArmstrong(int num){
        int original_num;
        original_num=num;
        int temp,count=0;
        temp=num;
        while(temp!=0){
            temp/=10;
            count++;
        }
        temp=num;
        int sum=0;
        while(temp!=0){
            int last_digit=temp%10;
            sum+=Math.pow(last_digit,count);
            temp/=10;
        }
        return original_num==sum;
    }
}


class reverse{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        reverse(arr);
    }

    static void reverse(int[] arr){
        int size=arr.length;
        int i=0,j=size-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<size;k++){
            System.out.print(arr[k]+" ");
        }
    }
}