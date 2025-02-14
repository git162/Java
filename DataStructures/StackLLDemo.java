package DataStructures;

public class StackLLDemo {
    public static void main(String[] args) {
        StackLL stack = new StackLL();
        stack.insert(27); 
        stack.display();
        stack.insert(34);
        stack.display();
        stack.delete();
        stack.insert(45);
        stack.display();
    }
}
