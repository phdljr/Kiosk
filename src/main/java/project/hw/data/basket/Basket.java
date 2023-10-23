package project.hw.data.basket;

import project.hw.controller.dto.MenuDto;
import project.hw.data.menu.Menu;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Map<String, MenuDto> basket = new HashMap<>();

    public void addMenu(Menu menu) {
        MenuDto dto = menu.toDto();

        String menuName = dto.getName();
        int menuCount = dto.getCount();

        if (basket.containsKey(menuName)) {
            basket.get(menuName).addCount(menuCount);
        } else {
            basket.put(menuName, menu.toDto());
        }
    }

    public Map<String, MenuDto> getBasket() {
        return basket;
    }

    public void clear() {
        basket.clear();
    }
}
