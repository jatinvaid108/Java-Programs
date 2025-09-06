package LinkedLists;

public class Basics4 {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class LinkedLists{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int value){
            Node temp=new Node(value);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedLists ll=new LinkedLists();
        ll.insertAtEnd(3);
        ll.insertAtEnd(2);
        ll.insertAtEnd(55);
        ll.insertAtEnd(11);

        ll.display();
    }
}

