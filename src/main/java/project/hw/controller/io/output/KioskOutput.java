package project.hw.controller.io.output;

import project.hw.controller.dto.MenuDto;
import project.hw.data.basket.Basket;
import project.hw.data.menu.MainMenu;
import project.hw.data.menu.Menu;
import project.hw.data.menu.burger.Burger;
import project.hw.data.order.Orders;
import project.hw.service.MainMenuService;
import project.hw.service.menu.BeerMenuService;
import project.hw.service.menu.BurgerMenuService;
import project.hw.service.menu.PizzaMenuService;

import java.util.List;

public class KioskOutput {

    private final int MAINMENU_LENGTH = MainMenu.values().length;

    private final MainMenuService mainMenuService;
    private final BurgerMenuService burgerMenuService;
    private final PizzaMenuService pizzaMenuService;
    private final BeerMenuService beerMenuService;
    private final Basket basket;
    private final Orders orders;

    public KioskOutput(Basket basket, Orders orders) {
        this.basket = basket;
        this.orders = orders;
        mainMenuService = new MainMenuService();
        burgerMenuService = new BurgerMenuService();
        pizzaMenuService = new PizzaMenuService();
        beerMenuService = new BeerMenuService();
    }

    public void printMainMenu() {
        System.out.println("SHAKESHACK BURGER에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 상품을 골라 입력해주세요.\n");
        System.out.println("[ SHAKESHACK MENU ]");

        printMainMenuBetween(1, MAINMENU_LENGTH - 2);
        System.out.println("\n[ ORDER MENU ]");
        printMainMenuBetween(MAINMENU_LENGTH - 2, MAINMENU_LENGTH);
    }

    private void printMainMenuBetween(int start, int end) {
        MainMenu[] menus = MainMenu.values();
        int space = mainMenuService.getMainMenuMaxNameLength();

        int i = start;
        for (; i < end; i++) {
            String name = menus[i].getName();
            String description = menus[i].getDescription();
            System.out.printf("%d. %-" + space + "s | %s\n", i, name, description);
        }
    }

    public void printSales() {
        System.out.println("[ 총 판매금액 현황 ]");
        System.out.printf("현재까지 총 판매된 금액은 [ W %.1f ] 입니다.\n\n", orders.getTotalSales());

        System.out.println("[ 총 판매상품 목록 현황 ]");
        System.out.println("현재까지 총 판매된 상품 목록은 아래와 같습니다.\n");

        int space = orders.getOrderMenuMaxNameLength();
        for (MenuDto dto : orders.getTotalSalesList()) {
            System.out.printf("- %-" + space + "s | W %-4.1f | %d 개\n", dto.getName(), dto.getCost(), dto.getCount());
        }

        System.out.println("\n1. 돌아가기");
    }

    private void printMenuTop() {
        System.out.println("SHAKESHACK BURGER에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n");
    }

    private void printBurgers() {
        printMenuTop();
        System.out.println("[ Burgers MENU ]");

        List<Burger> burgers = burgerMenuService.getBurgers();
        int nameSpace = burgerMenuService.getMaxNameLength();

        printMenuList(burgers, nameSpace);
    }

    private void printPizzas() {
        //TODO
    }

    private void printBeers() {
        //TODO
    }

    private void printMenuList(List<? extends Menu> list, int nameSpace) {
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getName();
            double cost = list.get(i).getCost();
            String description = list.get(i).getDescription();
            System.out.printf("%d. %-" + nameSpace + "s | W %.1f | %s\n", i + 1, name, cost, description);
        }
    }

    public void printCheckOrder() {
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println("1. 주문\t\t 2. 메뉴판");
    }

    public void printOrder(int sequence) {
        try {
            System.out.println("주문이 완료되었습니다!\n");
            System.out.printf("대기번호는 [ %d ] 번 입니다.\n", sequence);
            System.out.println("3초 후 메뉴판으로 돌아갑니다.");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void printAddMenu(int mainMenuNumber, int menuNumber) {
        switch (mainMenuNumber) {
            case 1:
                MenuDto burger = burgerMenuService.getBurger(menuNumber);
                System.out.println(burger);
        }
    }

    public void printCheckCancel() {
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println("1. 확인\t\t2. 취소");
    }

    public void printCancel() {
        System.out.println("진행하던 주문이 취소되었습니다.\n");
    }
}
