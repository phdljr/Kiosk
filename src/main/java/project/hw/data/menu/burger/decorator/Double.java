package project.hw.data.menu.burger.decorator;

import project.hw.data.menu.burger.Burger;

public class Double extends BurgerDecorator {

    public Double() {
    }

    public Double(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getOptionName() {
        return "Double";
    }

    @Override
    public String getName() {
        return burger.getName() + "(Double)";
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + "(더블 사이즈)";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 2.0;
    }
}
