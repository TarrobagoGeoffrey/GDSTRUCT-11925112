package com.company;

public class Main {

    public static void main(String[] args) {

        LinkedStack stack = new LinkedStack();

        stack.push(new Player(1,"Antreya",58));
        stack.push(new Player(2,"Semna", 60));
        stack.push(new Player(3,"Rinesha", 60));
        stack.push(new Player(4,"Zephirina",61));
        stack.push(new Player(5,"Sagun",61));

        stack.printStack();

        System.out.println("Peeking: " + stack.pop());

        stack.printStack();
    }
}
