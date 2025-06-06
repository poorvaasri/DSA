import java.util.*;

class Main {
    static final int MAXSIZE = 10;
    static int[] stack = new int[10];
    static int top = -1;
    
    static void push(int val){
        if(top>=MAXSIZE)
        {
            System.out.println("Stack Overflow");
        }
        stack[++top] = val;
        System.out.println(val + " is pushed into the stack");
    }
    
    static void pop(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(stack[top--] + " is popped");
    }
    
    static void peak(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("The top element is " + stack[top]);
    }
    
     static void printStack(){
        for (int i =0; i < MAXSIZE; i++){
            if( stack[i] != 0) System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        pop();
        peak();
        printStack();
    }
}
