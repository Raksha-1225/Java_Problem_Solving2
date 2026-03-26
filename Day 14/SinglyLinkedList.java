import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;

    }
}

class LinkedList{
    Node head=null;
    Node tail=null;
    int count=0;
    
    //Insertion at the last
    void insert(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
        count++;
    }

    //Insertion at the first
    void insertAtFirst(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode; 
        }
        
    }

    //insert at position
    void insertAtposition(int k,int data){
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=1;i<k-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    void deleteAtfirst(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
        }
    }

    void deleteAtlast(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            tail=null;
        }
        else{
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
        }
    }

    //delete at the node present at kth position
    void deleteAtposition(int k){
        Node temp=head;
        for(int i=1;i<k-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }

}

public class SinglyLinkedList {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //insertion at the last
        LinkedList ll=new LinkedList();
        while(true){
            int val=sc.nextInt();
            if(val==-1){
                break;
            }
            else{
                ll.insert(val);
            }
        }

        ll.display();
        ll.insertAtposition(4,40);
        ll.display();
        ll.deleteAtposition(3);
        ll.display();
        ll.deleteAtfirst();
        ll.display();
        ll.deleteAtlast();
        ll.display();

        //insertion at the first
        LinkedList ll2=new LinkedList();
        while(true){
            int val=sc.nextInt();
            if(val==-1){
                break;
            }
            else{
                ll2.insertAtFirst(val);
            }
        }
        ll2.display();
    }
    
}
