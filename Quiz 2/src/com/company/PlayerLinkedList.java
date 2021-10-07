package com.company;

public class PlayerLinkedList {

    private PlayerNode head;

//    public static void remove()
//    {
//        PlayerNode current = head;
//        head = current.getNextPlayer();
//    }

//    public void remove(PlayerNode current) {
//        current = head;
//        head = current.getNextPlayer();
//    }

    public void size(playerLinkedList)
    {
        playerLinkedList
    }

    public void removeHead()
    {
        head = head.getNextPlayer();
    }

    public void addToFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void printList() {
        PlayerNode current = head;
        System.out.print("HEAD --> ");
        while (current != null) {
            System.out.print(current.getPlayer());
            System.out.print(" --> ");
            current = current.getNextPlayer();
        }
        System.out.println("Null");
    }
}
