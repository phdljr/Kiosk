import org.junit.jupiter.api.Test;
import project.hw.controller.io.output.KioskOutput;
import project.hw.data.menu.Menu;
import project.hw.data.menu.MainMenu;
import project.hw.data.menu.pizza.PepperoniPizza;
import project.hw.data.menu.pizza.decorator.Large;
import project.hw.data.menu.pizza.decorator.Medium;
import project.hw.service.MainMenuService;

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
        KioskOutput kioskOutput = new KioskOutput();
        kioskOutput.printMainMenu();
    }
}
