package com.company;

import java.util.Objects;

public class Cards {
    private int id;
    private String name;
    private int power;
    private int defence;

    public Cards(int id, String name, int power, int defence) {
        this.id = id;
        this.name = name;
        this.power = power;
        this.defence = defence;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", power=" + power +
                ", defence=" + defence +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cards cards = (Cards) o;
        return id == cards.id && power == cards.power && defence == cards.defence && name.equals(cards.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, power, defence);
    }
}
