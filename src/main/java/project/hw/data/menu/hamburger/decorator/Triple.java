package project.hw.data.menu.hamburger.decorator;

import project.hw.data.menu.hamburger.Hamburger;

public class Triple extends HamburgerDecorator{
    public Triple(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public String getName() {
        return hamburger.getName() + "(Triple)";
    }

    @Override
    public String getDescription() {
        return hamburger.getDescription() + "(트리플 사이즈)";
    }

    @Override
    public double getCost() {
        return hamburger.getCost() + 3.0;
    }
}
