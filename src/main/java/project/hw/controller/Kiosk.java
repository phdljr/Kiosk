package project.hw.controller;

import project.hw.controller.io.input.KioskInput;
import project.hw.controller.io.output.KioskOutput;
import project.hw.data.basket.Basket;
import project.hw.repository.menu.HamburgerRepository;
import project.hw.data.order.Orders;

public class Kiosk {
    private final KioskInput kioskInput;
    private final KioskOutput kioskOutput;
    private final Basket basket;
    private final HamburgerRepository menus;
    private final Orders orders;

    public Kiosk(KioskInput kioskInput, KioskOutput kioskOutput, Basket basket, HamburgerRepository menus, Orders orders) {
        this.kioskInput = kioskInput;
        this.kioskOutput = kioskOutput;
        this.basket = basket;
        this.menus = menus;
        this.orders = orders;
    }

    public void start(){
        while (true){
            printMainMenu();
        }
    }

    public boolean printMainMenu(){
        kioskOutput.printMainMenu();
        return true;
    }

    public boolean printMenu(){
        return true;
    }

    public boolean addMenu(){
        return true;
    }

    public boolean order(){
        return true;
    }

    public boolean printSales(){
        return true;
    }

    public boolean exit(){
        return false;
    }
}
