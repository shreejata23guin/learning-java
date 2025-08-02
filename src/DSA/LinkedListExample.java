package DSA;

public class LinkedListExample {
    class Node { // Node class to define the structure of a node
        int data;  // value of the node
        Node next;   // reference to the next node

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    Node head = null;   // head of the list (starts as empty)

    public void insert(int value) {       // Insert node at the end
        Node newNode = new Node(value);  // create new node
        if (head == null) {
            head = newNode; // if list is empty, new node becomes head
        } else {
            Node temp = head; // start from head
            while (temp.next != null) {
                temp = temp.next; // move to next node
            }
            temp.next = newNode;  // insert at end
        }
    }

    public void delete() {  // Delete node from front
        if (head == null) {
            System.out.println("List is empty");
        } else {

            System.out.println("Deleted:" + head.data);
            head = head.next;  // remove first node
        }
    }

    public void display() {  // Display all nodes
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            System.out.print("Linked List:");
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {    // Main method to test
        LinkedListExample list = new LinkedListExample();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();

        list.delete();
        list.display();
    }
}






