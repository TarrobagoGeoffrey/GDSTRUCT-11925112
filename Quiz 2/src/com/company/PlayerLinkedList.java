package com.company;

public class PlayerLinkedList {

    private PlayerNode head;

   /* public static void remove()
    {
        PlayerNode current = head;
        head = current.getNextPlayer();
    }

    public void remove(PlayerNode current) {
        current = head;
        head = current.getNextPlayer();
    }*/

 /*   public boolean contains(Player player)
    {
        PlayerNode temp = head;
        int list = 0;
        while (temp != )
        {
            if (temp == )
            {
                return;
            }
            else
            {
                temp = temp.getNextPlayer();
                list++;
            }
        }
        System.out.println("Player is: " + list);
    }*/

    public int indexOf(Player player)
    {
        PlayerNode temp = head;
        int index = 0;

        while (temp != null)
        {
            if (temp.getPlayer().equals(player))
            {
                return index;
            }
            else
            {
                temp = temp.getNextPlayer();
                index++;
            }
        }
        return index;
    }

    public boolean contains(Player player)
    {
        PlayerNode current = head;

        while (current != null) {
            if (current.getPlayer().equals(player))
            {
                return true;
            }
            else
            {
                current = current.getNextPlayer();
            }
        }
        return true;
    }

    public void size()
    {
        PlayerNode temp = head;
        int list = 0;
        while (temp != null)
        {
            temp = temp.getNextPlayer();
            list++;
        }
        System.out.println("Number of Players: " + list);
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
