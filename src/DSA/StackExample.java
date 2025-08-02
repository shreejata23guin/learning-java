package DSA;

public class StackExample {

    int top=-1;// tracks the top index
    int[] stack=new int[5]; //fixed size stack
    private boolean Value;

    //push=add item to stack
    void push(int value){ //Adds item if there's space
        if (top==stack.length-1) { //Checks if the stack is full
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top]=value;
        System.out.println(Value+"pushed");
        }
        //pop=remove items from top
    void pop(){ //Removes and prints top item
        if(top==-1){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(stack[top]+"popped");
        top--;
    }
    //display current stack
    void display(){ //Shows current stack from top to bottom
        if (top==-1) { // Checks if stack is empty
            System.out.println("Stack is empty");
            return;
        }
            System.out.println("Current stack:");
            for (int i=top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }
        public static void main(String[] args){ //Runs the test with 3 pushes and 2 pops
        StackExample s=new StackExample();
        
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        
        s.pop();
        s.display();
    }
}
