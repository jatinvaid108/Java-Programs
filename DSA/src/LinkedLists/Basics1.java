package LinkedLists;

public class Basics1 {
    public static class Node{
        int data;
        Node next;


        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);      //Here 5 is representing the Data
        Node b=new Node(7);
        Node c=new Node(9);
        Node d=new Node(11);
        Node e=new Node(13);

        System.out.println(a.data);  //Will print a ka data
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(a.next);  //Will print b ka address
        System.out.println(b);  //Address is same as above

        System.out.println(a.next.next.next.data);

    }
}



class printing{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(8);
        Node d=new Node(9);
        Node e=new Node(6);

        //Linking
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        //Let's assume a temporary node and maek it equal to/ points towards a
        Node temp=a;
//        for(int i=1;i<=5;i++){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }


        //if size is not known
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
}

//Why we use temp Node while printing the list ?
//Because if we use head evetually head will become  null at the last . So we will lost access to our list forever


class withFunction{

    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
    }
    public static class Node{
        int data;
        Node next;


        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(8);
        Node d=new Node(9);
        Node e=new Node(6);

        //Linking
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
    }
}



//Practice


class may{
    public static void displayList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public static class Node{
        int data;
        Node next;


        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args){
        Node a=new Node(2);
        Node b=new Node(5);
        Node c=new Node(7);
        Node d=new Node(9);
        Node e=new Node(12);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        displayList(a);
    }
}
