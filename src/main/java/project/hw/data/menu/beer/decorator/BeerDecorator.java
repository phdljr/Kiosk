package project.hw.data.menu.beer.decorator;

import project.hw.data.menu.beer.Beer;

public abstract class BeerDecorator extends Beer {
    protected Beer beer;

    abstract public String getName();

    abstract public String getDescription();

    abstract public double getCost();
}
