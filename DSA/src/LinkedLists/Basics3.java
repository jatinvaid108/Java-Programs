package LinkedLists;


//This is Insertion at End with the tail Pointer Means O(1) Time Complexity on gfg practice 
//class Solution {
//    Node insertAtEnd(Node head, Node tail, int data) {
//        Node newNode = new Node(data);
//
//        if (head == null) {
//            head = newNode;
//            tail = newNode;
//            return head;
//        }
//
//        tail.next = newNode;   // Tail points to new node
//        tail = newNode;        // Move tail to new node
//
//        return head;
//    }
//}

//This is Inserting At end Without the tail Pointer Time Complexity is O(n) Since we Need to traverse
//class Solution {
//    Node insertAtEnd(Node head, int data) {
//        Node newNode = new Node(data);
//
//        if (head == null) {
//            head = newNode;
//            return head;
//        }
//
//        Node temp = head;
//        while (temp.next != null) {   // Traverse till last node
//            temp = temp.next;
//        }
//
//        temp.next = newNode;   // Last node points to new node
//        return head;
//    }
//}





public class Basics3 {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
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

        void printList(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

        int size(){
            int count=0;
            Node temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insertAtEnd(5);
        ll.insertAtEnd(10);
        ll.insertAtEnd(15);
        ll.insertAtEnd(20);

        // Printing the linked list
        ll.printList();       //There is no need to pass something in this func since func class k andar hai toh sb kush available hai ....like head tail etc
        System.out.println();
        System.out.println("Size of Linked List is : " +ll.size());

        ll.insertAtEnd(57);
        ll.printList();

        System.out.println();
        System.out.println("Size of Linked List is : " +ll.size());
    }
}

//See above we are creating the Linked List by ourselves . Isn't it great like yee appas mein connect bhi ho rhe hain..........


//Insert at beginning

class Insert{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static class NewList{
        Node head=null;
        Node tail=null;

        void insertAtHead(int value){
            Node temp=new Node(value);
            if(head==null){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }

        int size(){
            int count=0;
            Node temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        void inserAtIndex(int idx,int value){
            Node t=new Node(value);
            Node temp=head;
            if(idx==size()){
//                insertAtEnd(value);
                return;   //this will stop code further
            }
            else if(idx==0){
                insertAtHead(value);
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
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
        NewList ll=new NewList();
        ll.insertAtHead(31);
        ll.insertAtHead(22);
        ll.insertAtHead(77);
        ll.insertAtHead(21);
        ll.insertAtHead(11);

        ll.display();
        System.out.println();
        ll.inserAtIndex(2,17);
        ll.display();

    }
}



