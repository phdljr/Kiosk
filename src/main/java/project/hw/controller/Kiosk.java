package project.hw.controller;

import project.hw.controller.io.input.KioskInput;
import project.hw.controller.io.output.KioskOutput;
import project.hw.data.basket.Basket;
import project.hw.data.order.Orders;
import project.hw.service.MainMenuService;

public class Kiosk {

    private final KioskInput kioskInput;
    private final KioskOutput kioskOutput;
    private final MainMenuService mainMenuService;
    private final Basket basket;
    private final Orders orders;

    public Kiosk() {
        basket = new Basket();
        orders = new Orders();
        kioskInput = new KioskInput();
        kioskOutput = new KioskOutput(basket, orders);
        mainMenuService = new MainMenuService();
    }

    public void start() {
        int mainMenuLength = mainMenuService.getMainMenuLength();

        while (true) {
            kioskOutput.printMainMenu();
            int select = kioskInput.selectNumber();
            if (select == 0) {
                showSalesHistory();
            } else if (select == mainMenuLength + 1) {
                showOrderScreen();
            } else if (select == mainMenuLength + 2) {
                showOrderCancel();
            } else {
                showSelectMenuScreen(select);
            }
        }
    }

    private void showSalesHistory() {
        kioskOutput.printSales();
        kioskInput.selectNumber();
    }

    private void showOrderScreen() {
        if(basket.isEmpty()){
            kioskOutput.printEmptyBasket();
            return;
        }

        kioskOutput.printCheckOrder();
        int select = kioskInput.selectNumber();
        if (select == 1) {
            int sequence = orders.order(basket);
            kioskOutput.printOrder(sequence);
        }
    }

    private void showOrderCancel() {
        kioskOutput.printCheckCancel();
        int select = kioskInput.selectNumber();
        if (select == 1) {
            kioskOutput.printCancel();
            basket.clear();
        }
    }

    /**
     * 메뉴 선택 화면
     */
    private void showSelectMenuScreen(int mainMenuNumber) {
        // 선택 후, 옵션 선택 화면으로 넘어가기
        kioskOutput.printMenus(mainMenuNumber);
        int menuNumber = kioskInput.selectNumber();
        showSelectOptionScreen(mainMenuNumber, menuNumber);
    }

    /**
     * 옵션 선택 화면
     * @param mainMenuNumber
     * @param menuNumber
     */
    private void showSelectOptionScreen(int mainMenuNumber, int menuNumber){
        kioskOutput.printOptions(mainMenuNumber, menuNumber);
        int optionNumber = kioskInput.selectNumber();
        showCheckAddMenuScreen(mainMenuNumber, menuNumber, optionNumber);
    }

    /**
     * 장바구니에 메뉴 추가 화면
     */
    private void showCheckAddMenuScreen(int mainMenuNumber, int menuNumber, int optionNumber){
        int select = kioskInput.selectNumber();
        if (select == 1) {
            // 메뉴 추가 화면
        }
    }
}
