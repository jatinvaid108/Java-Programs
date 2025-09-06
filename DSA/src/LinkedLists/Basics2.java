package LinkedLists;

public class Basics2 {
    public static void recursivePrint(Node head){
        if(head==null) return;
        System.out.print(head.data+ " ");
        recursivePrint(head.next);              //If you write it above then it will print list in reverse order
    }

    public static void displayReverse(Node head){
        if(head==null) return;
        displayReverse(head.next);
        System.out.print(head.data+" ");
    }
    public static class Node{
        int data;
        Node next;

        Node (int data){
            this.data=data;
        }
    }
    public static void main(String[] args){
        Node a=new Node(11);
        Node b=new Node(19);
        Node c=new Node(17);
        Node d=new Node(15);
        Node e=new Node(13);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        recursivePrint(a);
        System.out.println();
        displayReverse(a);
    }
}


//Find the Length of the Linked List (Iterative and Recursive ):

class length{
    public static int display(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node x=new Node(94);
        Node y=new Node(86);
        Node z=new Node(72);
        Node a=new Node(49);
        Node b=new Node(67);

        x.next=y;
        y.next=z;
        z.next=a;
        a.next=b;

        int length=display(x);
        System.out.println(length);
    }
}


