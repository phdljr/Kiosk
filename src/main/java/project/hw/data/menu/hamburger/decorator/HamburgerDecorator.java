package project.hw.data.menu.hamburger.decorator;

import project.hw.data.menu.hamburger.Hamburger;

public abstract class HamburgerDecorator extends Hamburger {
    protected Hamburger hamburger;

    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    abstract public String getName();

    abstract public String getDescription();

    abstract public double getCost();
}
