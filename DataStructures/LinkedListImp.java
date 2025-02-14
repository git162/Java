package DataStructures;
import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedListImp{
    public Node head;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");  
            temp = temp.next;
        }
        return;
    }
}

