package project.hw.repository.option;

import project.hw.data.menu.burger.decorator.BurgerDecorator;
import project.hw.data.menu.burger.decorator.Double;
import project.hw.data.menu.burger.decorator.Single;
import project.hw.data.menu.burger.decorator.Triple;

import java.util.ArrayList;
import java.util.List;

public class BurgerOptionRepository {
    private List<BurgerDecorator> options = new ArrayList<>();

    public BurgerOptionRepository() {
        options.add(new Single());
        options.add(new Double());
        options.add(new Triple());
    }

    public BurgerDecorator findByIndex(int index) {
        BurgerDecorator menu = null;
        try {
            menu = (BurgerDecorator) options.get(index).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return menu;
    }
}
