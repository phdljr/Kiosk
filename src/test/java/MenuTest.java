import org.junit.jupiter.api.Test;
import project.hw.controller.io.output.KioskOutput;
import project.hw.data.basket.Basket;
import project.hw.data.menu.Menu;
import project.hw.data.menu.burger.Burger;
import project.hw.data.menu.burger.decorator.BurgerDecorator;
import project.hw.data.menu.pizza.PepperoniPizza;
import project.hw.data.menu.pizza.decorator.Large;
import project.hw.data.menu.pizza.decorator.Medium;
import project.hw.data.order.Orders;
import project.hw.repository.menu.BurgerRepository;
import project.hw.repository.option.BurgerOptionRepository;

public class MenuTest {
    @Test
    public void orderMenu(){
        Menu pepperoniPizza = new PepperoniPizza();
        Menu pepperoniPizzaMedium = new Medium(new PepperoniPizza());
        Menu pepperoniPizzaLarge = new Large(new PepperoniPizza());

        System.out.println(pepperoniPizza);
        System.out.println(pepperoniPizzaMedium);
        System.out.println(pepperoniPizzaLarge);
    }

    @Test
    public void printMainMenu(){
        KioskOutput kioskOutput = new KioskOutput(new Basket(), new Orders());
        kioskOutput.printMainMenu();
    }

    @Test
    public void cloneMenu(){
        BurgerRepository burgerRepository = new BurgerRepository();
        BurgerOptionRepository optionRepository = new BurgerOptionRepository();

        Burger smokeBurger = burgerRepository.findByIndex(1);
        BurgerDecorator single = optionRepository.findByIndex(1);
        single.setBurger(smokeBurger);

        System.out.println(single);

        Burger smokeBurger2 = burgerRepository.findByIndex(2);
        BurgerDecorator single2 = optionRepository.findByIndex(1);
        single2.setBurger(smokeBurger2);
        single2.toDto();

        System.out.println(single2);
    }
}
