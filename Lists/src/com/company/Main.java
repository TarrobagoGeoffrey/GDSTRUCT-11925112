package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player(1, "Sinon", 100));
        playerList.add(new Player(2, "Blank", 315));
        playerList.add(new Player(3, "Shiro", 175));

//        System.out.println(playerList.get(1));

//        playerList.add(2, new Player(4,"Maple", 76));

//        playerList.remove(2);

//        System.out.println(playerList.contains(new Player(2,"Blank", 315)));

//        System.out.println(playerList.indexOf(new Player(1, "Sinon", 100)));

        for (Player p : playerList)
        {
            System.out.println(p);
        }
    }
}
