package project.hw.data.menu.hamburger.decorator;

public class Single extends HamburgerDecorator{
    @Override
    public String getName() {
        return hamburger.getName();
    }

    @Override
    public String getDescription() {
        return hamburger.getDescription();
    }

    @Override
    public double getCost() {
        return hamburger.getCost();
    }
}
