package Stacks;

import java.util.Stack;
import java.util.Scanner;
public class basics1 {
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();

        System.out.println(st.isEmpty());
        st.push(22);
        st.push(33);
        st.push(44);
        st.push(55);
        st.push(66);
        System.out.println("The size of the stack is: "+st.size() + " and the ele are:  "+st);

        System.out.println(st.peek());
        //let's say we want to print 2nd ele from  the stack

        while(st.size()>2){
            st.pop();
        }
        System.out.println(st);
    }
}

// If you want to insert the ele , Delete the element . The Time complexity will be o(1).
//Obviously if you want to access the specific element then it will be O(n)

//There is a problem Space complexity bhi O(n) lgti hai. Becoz when we want to access the specific ele then obviously Hum jo ele remove kr rhe hai vo bhi toh kahi store krne hai

//What is the Benefit ?? There is Unlimited Size we can say


class reverseOrder{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the No. of Element you like to insert in the stack: ");
        int n=input.nextInt();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            int x=input.nextInt();
            st.push(x);
        }
        System.out.println(st);


        Stack<Integer> newStack=new Stack<>();
        while(st.size()>0){
//            int y=st.peek();
//            newStack.push(y);
//            st.pop();
            //Direct Method
            newStack.push(st.pop());
        }

        System.out.println(newStack);
    }
}

//Let's say I want to Copy or Move the ele Below is the method

class Copy{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the elements you like to add : ");
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            int x=input.nextInt();
            st.push(x);
        }
        System.out.println(st);
        Stack <Integer>gt=new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }

        Stack <Integer> rt=new Stack<>();
        while(gt.size()>0){
            rt.push(gt.pop());
        }

        System.out.println(rt);
    }
}

//Basically To make copy or to move element we created one stack (reverse) ho gya Then iska bhi reverse kro with the new stack . Therefore Total 3 stacks ho gaye
