package Stacks;

import javax.swing.*;
import java.util.*;
//Stack Implementation with Linked List
//This is cool than Array implementation becoz isme hum unlimited size ki linked List bana skte hain
//Here we will see that we can create stack of unlimited ele . SInce we can create Linked list of unlimited size

class LinkedListImplementation{
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class Linkedlist{
        Node head=null;
        int size=0;

        void push(int ele){
            Node temp=new Node(ele);
            temp.next=head;
            head=temp;
            size++;
        }
        int  pop(){
            if(!isEmpty()){
                int poppedValue=head.val;
                head=head.next;     //Poppinh happening
                size--;
                return poppedValue;
            }
            return -1;
        }
        int peek(){
            return head.val;
        }

        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
        }

        //There will be no isFull function since size can be increased in LinkedList
        int size(){
            return size;
        }
    }
    public static void main(String[] args){
        Linkedlist st=new Linkedlist();
        st.push(1);
        st.push(2);
        st.push(3);
        st.display();
        System.out.println();
        System.out.println("Top element is: " + st.peek());
        st.display();
        st.pop();
        System.out.println();
        st.display();

        st.isEmpty();
        System.out.println();
        System.out.println("The size of the array is: "+st.size());
    }
}


class function{
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Jatin");
        list.add("Kartik");
        list.add("Arnav");
        list.add("Sushant");

        Collections.sort(list,(s1,s2)-> s1.compareTo(s2));    //lambda function
        System.out.println(list);
    }
}


class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aman", "Jatin", "Ravi");
        names.forEach(name -> System.out.println("Hello " + name));
    }
}
class hello{
    public static void main(String[] args) {
        String name="Students";
        String rev="";
        for(int i=0;i<name.length();i++){
            rev=name.charAt(i)+ rev;
        }
        System.out.println(rev);
    }
}
