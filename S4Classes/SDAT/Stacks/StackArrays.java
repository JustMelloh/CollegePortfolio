package Stacks;

public class StackArrays {

    int [] arr;
    int topOfStack;

    public StackArrays(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack created with size of: " + size);
    }

    /* Check to see if is Empty */

    public boolean isEmpty() {
        if (topOfStack == -1) {
            System.out.println("Stack is empty");
            return true;
        } else {
            System.out.println("Stack is not empty");
            return false;
        }
    }

    /* Check if Stack is full */

    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            System.out.println("Stack is full");
            return true;
        } else {
            System.out.println("Stack is not full");
            return false;
        }
    }


    /* Here we implement a push method */

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("Value has been pushed to the stack");
        }
    }

    // Implement Pop method

    // Implement Peek method

    // Implement Delete Stack

    // Use the DataStructure to check whether a word is a palindrome or not eg: race car == race car

    // Implement a stack DataStructure using LinkedList instead of Arrays.
}
