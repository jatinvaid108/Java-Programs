//Imagine 2D arrays as Arrays of Arrays
//Row size is Mandatory but Column Size is not mandatory

import java.util.Arrays;
import java.util.Scanner;

public class arrays2dSyntax {
    public static void main(String[] args) {

        int [][] arr=new int[3][2];   //one way

        int [][] mat={
                {1,2,3},
                {4,5,6,7},
                {6,2}
        };
//        System.out.println(mat[1][3]);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}


class takingInput{
    public static void main(String[] args) {
        int [][] matrix=new int[3][3];


        Scanner in=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=in.nextInt();
            }
        }

//        for(int i=0;i<3;i++){
//            System.out.println(Arrays.toString(matrix[i]));
//        }


//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }

        for(int num[]: matrix){     //for each
            System.out.println(Arrays.toString(num));
        }
    }
}