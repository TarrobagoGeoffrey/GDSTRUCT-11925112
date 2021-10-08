package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    private LinkedList<Cards> stack;

    public LinkedStack()
    {
        stack = new LinkedList<Cards>();
    }

    public void push(Cards cards)
    {
        stack.push(cards);
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public Cards pop ()
    {
        return stack.pop();
    }

    public Cards peek()
    {
        return stack.peek();
    }

    public void printStack()
    {
        ListIterator<Cards> iterator = stack.listIterator();

        System.out.println("Existing Stack: ");

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
