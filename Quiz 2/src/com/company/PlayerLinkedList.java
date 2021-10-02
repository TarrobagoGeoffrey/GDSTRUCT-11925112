package com.company;

public class PlayerLinkedList {

    private PlayerNode head;

    public static void removeAt(int i)
    {
        PlayerLinkedList.removeAt(1);
    }

    public static void size()
    {
        System.out.println(PlayerLinkedList.size());
    }

    public void addToFront(Player player)
    {
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
