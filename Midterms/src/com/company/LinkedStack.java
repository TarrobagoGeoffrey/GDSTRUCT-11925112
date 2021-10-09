package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class LinkedStack {
    private LinkedList<Cards> stack;

    public LinkedStack()
    {
        stack = new LinkedList<Cards>();
    }

/*
    public int random()
    {
        Random random = new Random();

        int command = random.nextInt(2);
        int x = random.nextInt(5);

        return int;
    }
*/

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

        System.out.println("Existing Cards: ");

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
            //System.out.println(iterator.next().getCard());
        }
    }
}
