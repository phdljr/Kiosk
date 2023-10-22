package project.hw.data.menu.pizza.decorator;

import project.hw.data.menu.pizza.Pizza;

public abstract class PizzaDecorator extends Pizza {
    protected Pizza pizza;

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract public String getName();

    abstract public String getDescription();

    abstract public double getCost();
}
