import org.junit.jupiter.api.Test;
import project.hw.data.basket.Basket;
import project.hw.data.menu.burger.ShackBurger;
import project.hw.data.menu.burger.SmokeShack;
import project.hw.data.menu.burger.decorator.Double;
import project.hw.data.menu.burger.decorator.Single;
import project.hw.data.menu.pizza.PepperoniPizza;

public class BasketTest {
    @Test
    public void addMenu(){
        Basket basket = new Basket();
        Double burger = new Double();
        burger.setBurger(new ShackBurger());
        basket.addMenu(burger);
        basket.addMenu(burger);

        burger.setBurger(new SmokeShack());
        basket.addMenu(burger);

        System.out.println(basket.getBasket());
    }

    @Test
    public void clearBasket(){
        Basket basket = new Basket();
        Double burger = new Double();
        burger.setBurger(new ShackBurger());
        basket.addMenu(burger);
        basket.addMenu(burger);

        burger.setBurger(new SmokeShack());
        basket.addMenu(burger);

        System.out.println(basket.getBasket());

        basket.clear();
        System.out.println(basket.getBasket());
    }
}
