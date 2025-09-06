package Stacks;

import java.util.Scanner;
import java.util.Stack;

//UnderFlow:- If stack is empty and you do st.peek() and st.pop     . It will throw an Empty Stack exception which is UnderFlow exception

//Overflow :- Stack Overflow occurs when you push an element into a full stack — i.e., there's no more space left to store new elements.If you're using an array-based custom stack, pushing beyond the array size causes overflow.
//
//In recursion, if function calls go too deep, the call stack overflows — this also throws a StackOverflowError in Java.


//Stack Implementation using Aarray

class arrayImplementation{
    public static class Stack{
        private int[] arr=new int[5];
        int idx=0;

        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full! ");
                return;
            }

            arr[idx]=x;
            idx++;
        }

        int peek(){
            if(idx==0){
                System.out.println("Array is Empty!");
                return -1;
            }
            return arr[idx-1];
        }

        int pop(){
            if(idx==0){
                System.out.println("Array is Empty. Nothing to pop !!");
                return -1;
            }

            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }

        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }

        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }

        int capacity(){
            return arr.length;
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.display();
        System.out.println("Top element is: " + st.peek());
        st.display();
        st.pop();
        st.display();

        st.isEmpty();
        st.isFull();
        System.out.println("The size of the array is: "+st.size());
    }
}


