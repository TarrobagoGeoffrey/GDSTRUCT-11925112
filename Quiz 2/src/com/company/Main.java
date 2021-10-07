package com.company;

public class Main {

    public static void main(String[] args) {

        Player amber = new Player(1, "Amber", 90);
        Player lumine = new Player(2, "Lumine", 90);
        Player baal = new Player(3,"Baal",90);
        Player zhongli = new Player(4, "Zhongli", 80);
        Player sara = new Player(5, "Sara",80);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(amber);
        playerLinkedList.addToFront(lumine);
        playerLinkedList.addToFront(baal);
        playerLinkedList.addToFront(zhongli);
        playerLinkedList.addToFront(sara);

        playerLinkedList.size(list);

        playerLinkedList.removeHead();

        playerLinkedList.printList();
    }
}
