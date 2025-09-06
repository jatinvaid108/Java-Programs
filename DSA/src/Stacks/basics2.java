package Stacks;

import java.util.Stack;
import java.util.Scanner;

public class basics2 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Scanner input=new Scanner(System.in);
        st.push(9);
        st.push(2);
        st.push(7);
        st.push(6);
        st.push(3);

        System.out.println("Enter the index you like to add ele at: ");
        int x=input.nextInt();
        System.out.println("Enter the ele: ");
        int ele=input.nextInt();

        Stack<Integer> temp=new Stack<>();
        while(st.size()>x){
            temp.push(st.pop());
        }
        st.push(ele);

        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}


//Reverse using Recursion

class Reverse{

    public static void reverseStack(Stack<Integer>st){
        if(st.size()==0) return;
        int top=st.pop();
        System.out.print(top+" ");
        reverseStack(st);
        st.push(top);
    }
    public static void recursionPrinting(Stack<Integer>gt){
        if(gt.size()==0) return;
        int top=gt.pop();
        recursionPrinting(gt);
        System.out.print(top+" ");
        gt.push(top);    //This is necessary so that we don't destroy the stack
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.println("Enter the Number of elements you like to add: ");
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            int x=input.nextInt();
            st.push(x);
        }
        System.out.println("Reverse using the Recursion: ");
        reverseStack(st);

        System.out.println();

        System.out.println("Printing with Recursion: ");
        recursionPrinting(st);
    }
}


