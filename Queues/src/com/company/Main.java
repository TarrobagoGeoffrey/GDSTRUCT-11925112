package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayQueue queue = new ArrayQueue(12);
        ArrayQueue lobby = new ArrayQueue(20);
        Random random = new Random();
        int numberOfGames = 10;


        while (numberOfGames < 10)
        {
            Scanner pause = new Scanner(System.in);
            int inGame = 0;
            int x = random.nextInt(7);

            if (x != 0)
            {
                for (int i = 0; i <= x; i++)
                {
                    int id = random.nextInt(1000);
                    int level = random.nextInt(100);
                    int gamer = random.nextInt(5000);
                    queue.add(new Player(0,"Gamer " + gamer,73));
                    inGame++;
                }
                queue.printQueue();
            }

            if (inGame >= 5)
            {
                numberOfGames++;
                for (int i = 0; i <= 5-1; i++)
                {
                    queue.remove();
                }

                System.out.println("Players left in queue ");
                queue.printQueue();
            }

            pause.nextLine();
        }
    }
}
