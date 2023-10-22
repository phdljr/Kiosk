package project.hw.data.menu.hamburger.decorator;

import project.hw.data.menu.hamburger.Hamburger;

public class Double extends HamburgerDecorator {
    public Double(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public String getName() {
        return hamburger.getName() + "(Double)";
    }

    @Override
    public String getDescription() {
        return hamburger.getDescription() + "(더블 사이즈)";
    }

    @Override
    public double getCost() {
        return hamburger.getCost() + 2.0;
    }
}
