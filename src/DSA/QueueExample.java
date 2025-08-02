package DSA;

public class QueueExample {
    int[] queue=new int[5];// This is a fixed-size array to represent the queue
    int front=0; //'front' is the index from where we'll remove (dequeue) elements
    int rear= -1; //'rear' is the index where we'll insert(enqueue) new elements
    void enqueue(int value) { // Method to add elements to the queue
        if (rear == queue.length - 1) { //If rear reaches the last index, queue is full
            System.out.println("Queue Overflow");// No space left to add
            return;
        }
        rear++;       // Move rear ahead
        queue[rear] = value;  // Add value at the new rear position
        System.out.println(value + "enqueued");
    }

    void dequeue() { // Method to remove elements from the front of the queue
        if (front > rear) {  // If front has crossed rear, it means no elements are left
            System.out.println("Queue Underflow"); // Nothing to remove
            return;
        }
        System.out.println(queue[front] + "dequeued"); // Show removed element
        front++; // Move front ahead to point to next item
    }
    void display(){   // Method to display all current elements in the queue
        if (front>rear){  // If front is beyond rear, queue is empty
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Current queue:"); // Loop from front to rear to show queue elements
        for (int i=front;i<=rear;i++) {
            System.out.println(queue[i]);
        }
        }
public static void main(String[] args){ // Main method to run and test the queue functions
        QueueExample q= new QueueExample(); // Create queue object
    // Enqueue (add) 3 elements
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();       // Show current state of the queue


        q.dequeue();
    // Remove (dequeue) one element
        q.display(); // Show queue again after removal
    }
}
