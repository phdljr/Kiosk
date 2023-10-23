package project.hw.data.order;

import project.hw.controller.dto.MenuDto;
import project.hw.data.basket.Basket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Orders {

    private int orderSequence = 1;
    private final Map<String, MenuDto> orders = new HashMap<>();

    public int order(Basket basket) {
        Map<String, MenuDto> menus = basket.getBasket();
        menus.forEach((k, v) -> orders.merge(k, v, (v1, v2) -> v1.addCount(v2.getCount())));
        basket.clear();
        return orderSequence++;
    }

    public double getTotalSales() {
        double result = 0;
        for (MenuDto menuDto : orders.values()) {
            result += menuDto.getCost() * menuDto.getCount();
        }
        return result;
    }

    public List<MenuDto> getTotalSalesList() {
        return new ArrayList<>(orders.values());
    }

    public int getOrderMenuMaxNameLength() {
        List<MenuDto> list = new ArrayList<>(orders.values());
        int result = 1;
        for (MenuDto dto : list) {
            if (result < dto.getName().length()) {
                result = dto.getName().length();
            }
        }
        return result;
    }
}
