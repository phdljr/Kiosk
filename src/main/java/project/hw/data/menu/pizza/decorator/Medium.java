package project.hw.data.menu.pizza.decorator;

import project.hw.data.menu.pizza.Pizza;

public class Medium extends PizzaDecorator {

    public Medium() {
    }

    public Medium(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return pizza.getName() + "(Medium)";
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "(미디움 사이즈)";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.0;
    }
}
