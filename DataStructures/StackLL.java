package DataStructures;

public class StackLL extends LinkedListImp{
    public void insert(int data){
        Node temp = head;
        Node newNode = new Node(data);
        head = newNode;
        newNode.next = temp;
    }
    public int delete(){
        if (head == null) {
            System.out.println("Stack is empty!");
            return -1; 
        }
        int deletedData = head.data;
        head = head.next; 
        return deletedData;
    }   
}


