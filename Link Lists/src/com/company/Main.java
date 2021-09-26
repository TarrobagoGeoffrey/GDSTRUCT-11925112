package com.company;

public class Main {

    public static void main(String[] args) {

        Player lumine = new Player(1, "Lumine", 90);
        Player baal = new Player(2, "Baal", 90);
        Player barbara = new Player(3, "Barbara", 70);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(lumine);
        playerLinkedList.addToFront(baal);
        playerLinkedList.addToFront(barbara);

        playerLinkedList.printList();
    }
}
