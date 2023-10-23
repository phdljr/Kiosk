package project.hw.data.menu.burger.decorator;

import project.hw.data.menu.burger.Burger;

public class Triple extends BurgerDecorator {

    public Triple() {
    }

    public Triple(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getOptionName() {
        return "Triple";
    }

    @Override
    public String getName() {
        return burger.getName() + "(Triple)";
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + "(트리플 사이즈)";
    }

    @Override
    public double getCost() {
        return burger.getCost() + 3.0;
    }
}
