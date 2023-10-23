package project.hw.repository.menu;

import project.hw.data.menu.burger.Burger;
import project.hw.data.menu.burger.ShackBurger;
import project.hw.data.menu.burger.ShroomBurger;
import project.hw.data.menu.burger.SmokeShack;

import java.util.ArrayList;
import java.util.List;

public class BurgerRepository {
    private final List<Burger> burgers = new ArrayList<>();

    public BurgerRepository() {
        burgers.add(new ShackBurger());
        burgers.add(new SmokeShack());
        burgers.add(new ShroomBurger());
    }

    public Burger findByIndex(int index) {
        return burgers.get(index);
    }

    public List<Burger> findAll() {
        return burgers;
    }
}
