package Strings;

import java.util.*;

public class Questions1 {
    public static String reverseString(String str){
//        String b="";
//        for(int i=str.length()-1;i>=0;i--){
//            b+=str.charAt(i);
//        }
//        return b;

        char[] arr=str.toCharArray();
        int i=0,j=arr.length-1;

        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);
    }

    public static void main(String[] args){
        String str;
        Scanner input=new Scanner(System.in);
        str=input.nextLine();
        String reversed=reverseString(str);
        System.out.println(reversed);

    }
}




