package project.hw.repository.menu;

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

    public Beer getBeer(String name) {
        for (Beer beer : beers) {
            if (beer.getName().equals(name)) {
                return beer;
            }
        }

        throw new IllegalArgumentException("잘못된 맥주 이름");
    }
}
