import java.util.Arrays;
import java.util.Scanner;

public class arraysSyntax {
    public static void main(String[] args){
        int[] arr=new int[5];

        Scanner input=new Scanner(System.in);
        //Taking Input
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }

        //printing  (Let's Use Enhanced for loop or for each loop)

//        for(int num: arr){
//            System.out.print(num+ " ");
//        }

        System.out.println(Arrays.toString(arr));
    }
}
