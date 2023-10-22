package project.hw.data.basket;

import project.hw.controller.dto.MenuDto;
import project.hw.data.menu.Menu;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Map<String, MenuDto> basket = new HashMap<>();

    public void addMenu(Menu menu) {
    }

    public Map<String, MenuDto> getBasket(){
        return basket;
    }

    public void clear(){
        basket.clear();
    }
}
