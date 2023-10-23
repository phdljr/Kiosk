package project.hw.data.menu.beer;

import project.hw.data.menu.Menu;

public abstract class Beer extends Menu {
    private double cost;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
