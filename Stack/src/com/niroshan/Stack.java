package com.niroshan;

public class Stack {

    private int arr[] ;
    private int capacity;
    private int top;

    public Stack() {
        this.arr = new int[capacity];
        int top = -1;
    }

    public Stack(int x) {
        arr= new int[x];
        capacity =  x;
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == capacity -1;
    }

    public void push(int data){

        if(isFull()){
            System.out.println("The Stack is Full");
            System.exit(1);
        }
//        top = top + 1;
        System.out.println(data + " inserted to the stack");
        arr[++top] = data;


    }
    public int pop(){

        if(isEmpty()){
            System.out.println("The Stack is Empty");
            System.exit(1);
        }
        //top = top -1;
        return arr[top--];


    }
    public int size(){
        return top + 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
	// write your code here
//        System.out.println("Hello Niroshan Ratnayake");
//        Stack s = new Stack();
//        s.push(10);
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        System.out.println("\nAfter popping out");

        stack.printStack();

    }
}
