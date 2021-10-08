package com.company;

import java.util.EmptyStackException;

public class CardStack {
    private Cards[] stack;
    private int top;

    public CardStack(int capacity) {stack = new Cards[capacity];}

    public void push (Cards cards)
    {
        if (top == stack.length)
        {
            Cards[] newStack = new Cards[2 * stack.length];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[top++] = cards;
    }

    public Cards pop()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        Cards poppedCards = stack[--top];
        stack[top] = null;
        return poppedCards;
    }

    public Cards peek()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    private boolean isEmpty()
    {
        return top ==0;
    }

    public void printStack()
    {
        System.out.println("Existing Cards: ");

        for (int i = top - 1; i >= 0; i--)
        {
            System.out.println(stack[i]);
        }
    }
}
