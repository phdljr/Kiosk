package project.hw.data.menu.pizza;

import project.hw.data.menu.Menu;

public abstract class Pizza extends Menu {
    private double cost;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
