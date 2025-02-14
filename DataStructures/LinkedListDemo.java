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

class LinkedList{
    Node head;
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

class LinkedListDemo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();

        boolean bool = true;
        while(bool){
            System.out.print("Insert data: ");
            int data = input.nextInt();
            list.insert(data);
            System.out.println("Present linked list is: ");
            list.display();
            System.out.print("\nDo you want to continue: ");
            data = input.nextInt();
            if(data == 0){
                bool = false;
            }else{
                bool = true;
            } 
        }
        input.close();
    }
}