package project.hw.repository;

import project.hw.data.menu.beer.Beer;
import project.hw.data.menu.beer.CassBeer;
import project.hw.data.menu.beer.HinekenBeer;
import project.hw.data.menu.beer.KozelBeer;

import java.util.HashMap;
import java.util.Map;

public class BeerRepository {
    private final Map<String, Beer> beers = new HashMap<>();

    public BeerRepository() {
        beers.put("Cass Beer", new CassBeer());
        beers.put("Kozel Beer", new KozelBeer());
        beers.put("Hineken Beer", new HinekenBeer());
    }

    public Beer getBeer(String name) {
        return beers.get(name);
    }
}
