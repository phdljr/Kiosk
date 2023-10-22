package project.hw.repository.option;

import project.hw.data.menu.Menu;
import project.hw.data.menu.hamburger.decorator.Double;
import project.hw.data.menu.hamburger.decorator.HamburgerDecorator;
import project.hw.data.menu.hamburger.decorator.Single;
import project.hw.data.menu.hamburger.decorator.Triple;

import java.util.HashMap;
import java.util.Map;

public class HamburgerOptionRepository {
    private Map<String, Menu> options = new HashMap<>();

    public HamburgerOptionRepository() {
        options.put("Single", new Single());
        options.put("Double", new Double());
        options.put("Triple", new Triple());
    }

    public HamburgerDecorator getOption(String option) {
        HamburgerDecorator menu = null;
        try{
            menu = (HamburgerDecorator) options.get(option).clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return menu;
    }
}
