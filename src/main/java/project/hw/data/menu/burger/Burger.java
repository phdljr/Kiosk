package project.hw.data.menu.burger;

import project.hw.data.menu.Menu;

public abstract class Burger extends Menu {
    private double cost;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
