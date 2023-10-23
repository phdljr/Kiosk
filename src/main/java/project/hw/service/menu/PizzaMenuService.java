package project.hw.service.menu;

import project.hw.data.menu.Menu;
import project.hw.data.menu.pizza.Pizza;
import project.hw.repository.menu.PizzaRepository;

import java.util.List;

public class PizzaMenuService {
    private final PizzaRepository pizzaRepository;

    public PizzaMenuService() {
        pizzaRepository = new PizzaRepository();
    }

    public List<Pizza> getPizzas() {
        return pizzaRepository.findAll();
    }

    public Menu findByIndex(int index) {
        return pizzaRepository.findByIndex(index);
    }

    public int getMaxNameLength() {
        int maxLength = 0;
        for (Pizza pizza : pizzaRepository.findAll()) {
            int length = pizza.getName().length();
            if (maxLength < length) {
                maxLength = length;
            }
        }
        return maxLength;
    }
}
