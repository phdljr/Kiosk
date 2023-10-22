package project.hw.data.menu.pizza.decorator;

import project.hw.data.menu.pizza.Pizza;

public abstract class PizzaDecorator extends Pizza {
    protected Pizza pizza;

    abstract public String getName();

    abstract public String getDescription();

    abstract public double getCost();
}
