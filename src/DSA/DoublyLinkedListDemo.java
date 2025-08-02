package DSA;

// Class representing a node in the doubly linked list
class Node{
    int data;  // Data stored in the node
    Node prev;  // Reference to the previous node
    Node next;    // Reference to the next node

    // Constructor to create a new node
    Node(int data){
       this.data=data;
       this.prev=null;
       this.next=null;
    }
}
// Main class for Doubly Linked List operations
public class DoublyLinkedListDemo {
    Node head;  // Head of the list

    // Method to insert a node at the end
    public void insertEnd(int data) {
        Node newNode = new Node(data);


        // If list is empty, make newNode the head
        if (head == null) {
            head = newNode;
            return;
        }
        // Otherwise, traverse to the last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }
    // Method to display list from beginning
public void displayForward(){
    Node temp=head;
    System.out.print("Forward:");
    while (temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println();
}

    // Method to display list from end
public void displayBackward(){
    Node temp=head;

    // Go to the last node
    if (temp==null)return;
    while (temp.next !=null){
        temp=temp.next;
    }
    // Traverse backward
    System.out.print("Backward: ");
    while (temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.prev;
    }
    System.out.println();
    }
    // Main method
    public static void main(String[] args){
        DoublyLinkedListDemo dll =new DoublyLinkedListDemo();
        // Add elements to the list
        dll.insertEnd(10);
        dll.insertEnd(20);
        dll.insertEnd(30);
        dll.insertEnd(40);

        // Display list in both directions
        dll.displayForward();
        dll.displayBackward();
    }
}