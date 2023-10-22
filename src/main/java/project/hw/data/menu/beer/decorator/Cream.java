package project.hw.data.menu.beer.decorator;

import project.hw.data.menu.beer.Beer;

public class Cream extends BeerDecorator {
    public Cream(Beer beer) {
        this.beer = beer;
    }

    @Override
    public String getName() {
        return beer.getName() + "(Cream)";
    }

    @Override
    public String getDescription() {
        return beer.getDescription() + "(크림 추가)";
    }

    @Override
    public double getCost() {
        return beer.getCost() + 0.5;
    }
}
