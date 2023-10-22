import org.junit.jupiter.api.Test;
import project.hw.controller.io.output.KioskOutput;
import project.hw.data.menu.Menu;
import project.hw.data.menu.MainMenu;
import project.hw.data.menu.hamburger.Hamburger;
import project.hw.data.menu.hamburger.decorator.HamburgerDecorator;
import project.hw.data.menu.pizza.PepperoniPizza;
import project.hw.data.menu.pizza.decorator.Large;
import project.hw.data.menu.pizza.decorator.Medium;
import project.hw.repository.menu.HamburgerRepository;
import project.hw.repository.option.HamburgerOptionRepository;
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

    @Test
    public void cloneMenu(){
        HamburgerRepository hamburgerRepository = new HamburgerRepository();
        HamburgerOptionRepository optionRepository = new HamburgerOptionRepository();

        Hamburger smokeBurger = hamburgerRepository.getBeer("SmokeBurger");
        HamburgerDecorator single = optionRepository.getOption("Single");
        single.setHamburger(smokeBurger);

        Hamburger smokeBurger2 = hamburgerRepository.getBeer("SmokeBurger");
        HamburgerDecorator single2 = optionRepository.getOption("Single");
        single2.setHamburger(smokeBurger);

        System.out.println(single);
        System.out.println(single2);
    }
}
