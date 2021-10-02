package com.company;

public class PlayerNode {
    private Player player;
    private PlayerNode nextPlayer;

    public PlayerNode(Player player, PlayerNode nextPlayer) {
        this.player = player;
        this.nextPlayer = nextPlayer;
    }

    public PlayerNode(Player player) {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public PlayerNode getNextPlayer() {
        return nextPlayer;
    }

    public void setNextPlayer(PlayerNode nextPlayer) {
        this.nextPlayer = nextPlayer;
    }
}
