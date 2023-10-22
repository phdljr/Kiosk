package project.hw.data.menu.pizza.decorator;

import project.hw.data.menu.pizza.Pizza;

public class Large extends PizzaDecorator{
    private final Pizza pizza;

    public Large(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return pizza.getName() + "(Large)";
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "(라지 사이즈)";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 5.0;
    }
}
