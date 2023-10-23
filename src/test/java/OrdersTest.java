import org.junit.jupiter.api.Test;
import project.hw.controller.io.output.KioskOutput;
import project.hw.data.basket.Basket;
import project.hw.data.menu.burger.ShackBurger;
import project.hw.data.menu.burger.SmokeShack;
import project.hw.data.menu.burger.decorator.Double;
import project.hw.data.order.Orders;

public class OrdersTest {
    @Test
    public void orderTest(){
        Orders orders = new Orders();
        Basket basket = new Basket();
        KioskOutput kioskOutput = new KioskOutput(basket, orders);
        Double burger = new Double();
        burger.setBurger(new ShackBurger());
        basket.addMenu(burger);
        basket.addMenu(burger);

        burger.setBurger(new SmokeShack());
        basket.addMenu(burger);

        System.out.println(orders.getTotalSalesList());

        orders.order(basket);
        System.out.println(orders.getTotalSalesList());
        System.out.println("추가주문===============================");
        burger.setBurger(new ShackBurger());
        basket.addMenu(burger);
        basket.addMenu(burger);

        burger.setBurger(new SmokeShack());
        basket.addMenu(burger);

        System.out.println(orders.getTotalSalesList());

        orders.order(basket);
        System.out.println(orders.getTotalSalesList());

        System.out.printf("총 금액: %.1f\n", orders.getTotalSales());
        kioskOutput.printSales();
    }
}
