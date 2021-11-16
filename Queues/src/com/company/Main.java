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

        queue.add(new Player(1, "Gura", 73));
        queue.add(new Player(2,"Kiara",90));
        queue.add(new Player(3,"Ame",90));
        queue.add(new Player(4, "Calli",97));
        queue.add(new Player(5,"Ina",101));
        queue.add(new Player(6,"Irys",73));
        queue.add(new Player(7,"Fauna",89));
        queue.add(new Player(8,"Bae",91));
        queue.add(new Player(9,"Kronii",91));
        queue.add(new Player(10,"Sana",97));
        queue.add(new Player(11,"Mumei",63));
        queue.add(new Player(12,"Omega",100));

        //queue.printQueue();

        int inQueue = 0;
        int inGame = 0;

        if (inQueue < 0)
        {
            int x = random.nextInt(7);
            for (int i = 0; i < x; i++)
            {
                lobby.add(queue.remove());
                inGame++;

            }
        }

        else if (inQueue >= 5)
        {
            lobby.printQueue();
        }
        
    }
}
