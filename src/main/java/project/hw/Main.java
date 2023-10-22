package project.hw;

import project.hw.controller.Kiosk;
import project.hw.controller.io.input.KioskInput;
import project.hw.controller.io.output.KioskOutput;
import project.hw.data.basket.Basket;
import project.hw.repository.menu.HamburgerRepository;
import project.hw.data.order.Orders;

public class Main {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk(
                new KioskInput(),
                new KioskOutput(),
                new Basket(),
                new HamburgerRepository(),
                new Orders()
        );

        kiosk.start();
    }
}
