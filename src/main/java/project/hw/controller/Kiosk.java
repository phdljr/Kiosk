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

    // TODO
    private void showSelectMenuScreen(int select) {

    }
}
