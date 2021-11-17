package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayQueue queue = new ArrayQueue(12);
        ArrayQueue lobby = new ArrayQueue(20);
        Random random = new Random();
        int numberOfGames = 0;


        while (numberOfGames < 10)
        {
            Scanner pause = new Scanner(System.in);
            int inGame = 0;
            int x = random.nextInt(7);

            if (x != 0)
            {
                for (int i = 0; i <= x; i++)
                {
                    int PID = random.nextInt(1000);
                    int lvl = random.nextInt(100);
                    int gamer = random.nextInt(1000);
                    queue.add(new Player(PID,"Gamer #" + gamer,lvl));
                    inGame++;
                }
                queue.printQueue();
            }

            if (inGame <= 7)
            {
                numberOfGames++;
                for (int i = 0; i <= 5; i++)
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
