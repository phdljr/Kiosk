package project.hw.repository.menu;

import project.hw.data.menu.Menu;
import project.hw.data.menu.beer.Beer;
import project.hw.data.menu.beer.CassBeer;
import project.hw.data.menu.beer.HinekenBeer;
import project.hw.data.menu.beer.KozelBeer;

import java.util.ArrayList;
import java.util.List;

public class BeerRepository {
    private final List<Beer> beers = new ArrayList<>();

    public BeerRepository() {
        beers.add(new CassBeer());
        beers.add(new KozelBeer());
        beers.add(new HinekenBeer());
    }

    public Menu findByIndex(int index) {
        return beers.get(index);
    }

    public List<Beer> findAll() {
        return beers;
    }
}
