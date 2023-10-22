package project.hw.repository.menu;

import project.hw.data.menu.beer.Beer;
import project.hw.data.menu.beer.CassBeer;
import project.hw.data.menu.beer.HinekenBeer;
import project.hw.data.menu.beer.KozelBeer;
import project.hw.data.menu.hamburger.Hamburger;
import project.hw.data.menu.hamburger.ShackBurger;
import project.hw.data.menu.hamburger.ShroomBurger;
import project.hw.data.menu.hamburger.SmokeShack;

import java.util.ArrayList;
import java.util.List;

public class HamburgerRepository {
    private final List<Hamburger> hamburgers = new ArrayList<>();

    public HamburgerRepository() {
        hamburgers.add(new ShackBurger());
        hamburgers.add(new SmokeShack());
        hamburgers.add(new ShroomBurger());
    }

    public Hamburger getBeer(String name) {
        for (Hamburger hamburger : hamburgers) {
            if (hamburger.getName().equals(name)) {
                return hamburger;
            }
        }

        throw new IllegalArgumentException("잘못된 버거 이름");
    }
}
