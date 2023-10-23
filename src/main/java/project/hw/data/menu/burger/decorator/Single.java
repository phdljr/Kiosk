package project.hw.data.menu.burger.decorator;

import project.hw.data.menu.burger.Burger;

public class Single extends BurgerDecorator {

    public Single() {
    }

    @Override
    public String getOptionName() {
        return "Single";
    }

    @Override
    public String getName() {
        return burger.getName();
    }

    @Override
    public String getDescription() {
        return burger.getDescription();
    }

    @Override
    public double getCost() {
        return burger.getCost();
    }
}
