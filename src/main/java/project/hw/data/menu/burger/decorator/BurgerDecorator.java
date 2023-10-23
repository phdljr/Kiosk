package project.hw.data.menu.burger.decorator;

import project.hw.data.menu.burger.Burger;

public abstract class BurgerDecorator extends Burger {
    protected Burger burger;

    public void setBurger(Burger burger) {
        this.burger = burger;
    }

    abstract public String getOptionName();

    abstract public String getName();

    abstract public String getDescription();

    abstract public double getCost();
}
