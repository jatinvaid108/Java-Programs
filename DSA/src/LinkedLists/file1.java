package LinkedLists;
//Ques: Find the Nth node from the end of the Linked List
//Ans: It is difficult to find the Nth node from the End of Linked List But it is easy from the start .. right!
// So with the help of AP we created a formula that ki
// Total Size of list mein se nth node minus kro then add 1


// We can also solve leetcode remove nth node with the help of thiss concept
//Below is time complexity O(n)
// But we can improve see in next step !! 
public class file1 {
    public static void main(String[] args){
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        Node ans = getNthNode(a,2);

        System.out.println("Nth Node from end is: " + ans.data);
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node getNthNode(Node head,int x){
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        //Again Node temp=head kr do Because upper temp null tkk aa gya hai na
        temp=head;
        int m=size-x+1;       //Now this is what we need to find from start
        for(int i=1;i<=m-1;i++){
            temp=temp.next;
        }
        return temp;
    }
}

// Although this Question also using O(n) time complexity and O(1) space complexity ....
// But the Main Point here is that We are performing here in SINGLE TRAVERSAL

class practice{
    public static void main(String[] args){
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(22);
        Node d=new Node(34);
        Node e=new Node(77);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node ans1=nNode(a,4);
        System.out.println("Nth node from end is "+ans1.data);


    }

    public static Node nNode(Node head,int x){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=x;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
}


