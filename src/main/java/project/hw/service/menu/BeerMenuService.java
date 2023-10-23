package project.hw.service.menu;

import project.hw.data.menu.Menu;
import project.hw.data.menu.beer.Beer;
import project.hw.repository.menu.BeerRepository;

import java.util.List;

public class BeerMenuService {
    private final BeerRepository beerRepository;

    public BeerMenuService() {
        beerRepository = new BeerRepository();
    }

    public List<Beer> getBeers() {
        return beerRepository.findAll();
    }

    public Menu findByIndex(int index) {
        return beerRepository.findByIndex(index);
    }

    public int getMaxNameLength() {
        int maxLength = 0;
        for (Beer beer : beerRepository.findAll()) {
            int length = beer.getName().length();
            if (maxLength < length) {
                maxLength = length;
            }
        }
        return maxLength;
    }
}
