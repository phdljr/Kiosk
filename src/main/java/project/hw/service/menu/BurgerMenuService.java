package project.hw.service.menu;

import project.hw.controller.dto.MenuDto;
import project.hw.data.menu.burger.Burger;
import project.hw.repository.menu.BurgerRepository;

import java.util.List;

public class BurgerMenuService {

    private final BurgerRepository burgerRepository;

    public BurgerMenuService() {
        burgerRepository = new BurgerRepository();
    }

    public List<Burger> getBurgers() {
        return burgerRepository.findAll();
    }

    public int getMaxNameLength(){
        int maxLength = 0;
        for(Burger burger: burgerRepository.findAll()){
            int length = burger.getName().length();
            if(maxLength < length){
                maxLength = length;
            }
        }
        return maxLength;
    }
}
