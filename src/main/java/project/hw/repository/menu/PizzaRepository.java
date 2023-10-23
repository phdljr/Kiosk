package project.hw.repository.menu;

import project.hw.data.menu.pizza.BaconPotatoPizza;
import project.hw.data.menu.pizza.CheesePizza;
import project.hw.data.menu.pizza.PepperoniPizza;
import project.hw.data.menu.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaRepository {
    private final List<Pizza> pizzas = new ArrayList<>();

    public PizzaRepository() {
        pizzas.add(new CheesePizza());
        pizzas.add(new PepperoniPizza());
        pizzas.add(new BaconPotatoPizza());
    }

    public Pizza findByIndex(int index) {
        return pizzas.get(index);
    }

    public List<Pizza> findAll() {
        return pizzas;
    }
}
