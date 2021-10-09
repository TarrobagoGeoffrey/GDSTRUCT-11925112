package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        LinkedStack stack = new LinkedStack();
        LinkedStack hand = new LinkedStack();
        LinkedStack discard = new LinkedStack();
        Random random = new Random();

        stack.push(new Cards(1, "Sora", 90, 32));
        stack.push(new Cards(2, "Miko", 75, 69));
        stack.push(new Cards(3, "Suisei", 90, 67));
        stack.push(new Cards(4, "AZKI", 85, 75));
        stack.push(new Cards(5, "Roboco", 85, 90));
        stack.push(new Cards(6, "IRyS", 89, 85));
        stack.push(new Cards(7, "Hachama", 98, 89));
        stack.push(new Cards(8, "Matsuri", 75, 56));
        stack.push(new Cards(9, "Aki", 79, 69));
        stack.push(new Cards(10, "Mel", 87, 53));
        stack.push(new Cards(11, "Fubuki", 97, 99));
        stack.push(new Cards(12, "Aqua", 76, 12));
        stack.push(new Cards(13, "Shion", 73, 15));
        stack.push(new Cards(14, "Choco", 89, 59));
        stack.push(new Cards(15, "Ayame", 77, 26));
        stack.push(new Cards(16, "Subaru", 87, 57));
        stack.push(new Cards(17, "Korone", 96, 38));
        stack.push(new Cards(18, "Mio", 94, 85));
        stack.push(new Cards(19, "Okayu", 65, 87));
        stack.push(new Cards(20, "Pekora", 88, 12));
        stack.push(new Cards(21, "Marine", 68, 55));
        stack.push(new Cards(22, "Noel", 91, 91));
        stack.push(new Cards(23, "Rushia", 95, 14));
        stack.push(new Cards(24, "Flare", 79, 56));
        stack.push(new Cards(25, "Towa", 62, 89));
        stack.push(new Cards(26, "Luna", 16, 13));
        stack.push(new Cards(27, "Watame", 69, 64));
        stack.push(new Cards(28, "Kanata", 86, 17));
        stack.push(new Cards(29, "Lamy", 85, 88));
        stack.push(new Cards(30, "Polka", 52, 32));

        stack.printStack();

        while (!stack.isEmpty())
        {
            int command = random.nextInt(2);
            int x = random.nextInt(5);

            if (command == 0)
            {
                for (int i = 0; i == x; i++)
                {
                    hand.push(stack.pop());
                    System.out.println("You drew: " + hand);
                }
            }
            else if (command == 1)
            {
                for (int i = 0; i == x; i++)
                {
                    discard.push(hand.pop());
                    System.out.println("You discarded " + discard);
                }
            }
            else
            {
                for (int i = 0; i == x; i++)
                {
                    hand.push(discard.pop());
                    System.out.print("You drew " + hand + " from discarded pile");
                }
            }
            //System.out.println(x);
        }


    }
}
