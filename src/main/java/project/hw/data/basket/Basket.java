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

    public boolean isEmpty(){
        return basket.isEmpty();
    }

    public int getMenuNameMaxLength(){
        int result = 0;
        for(MenuDto menuDto: basket.values()){
            if(result < menuDto.getName().length()){
                result = menuDto.getName().length();
            }
        }
        return result;
    }

    public Map<String, MenuDto> getBasket() {
        return basket;
    }

    public double getTotalCost(){
        double result = 0;
        for(MenuDto menuDto: basket.values()){
            result += menuDto.getCost() * menuDto.getCount();
        }
        return result;
    }

    public void clear() {
        basket.clear();
    }
}
