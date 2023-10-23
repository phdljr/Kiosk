package project.hw.data.menu.burger.decorator;

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
