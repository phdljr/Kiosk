package project.hw.data.menu.hamburger;

import project.hw.data.menu.Menu;

public abstract class Hamburger extends Menu {
    private double cost;

    public double getCost(){
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
