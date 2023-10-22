package project.hw.data.menu.beer.decorator;

import project.hw.data.menu.beer.Beer;

public class CinnamonPowder extends BeerDecorator {
    public CinnamonPowder(Beer beer) {
        this.beer = beer;
    }

    @Override
    public String getName() {
        return beer.getName() + "(Cinnamon Powder)";
    }

    @Override
    public String getDescription() {
        return beer.getDescription() + "(시나몬 가루 추가)";
    }

    @Override
    public double getCost() {
        return beer.getCost() + 1.0;
    }
}
