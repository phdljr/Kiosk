package project.hw.controller.io.output;

import project.hw.data.menu.MainMenu;
import project.hw.service.MainMenuService;

public class KioskOutput {

    private final MainMenuService mainMenuService;

    public KioskOutput() {
        mainMenuService = new MainMenuService();
    }

    public void printMainMenu(){
        System.out.println("SHAKESHACK BURGER에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n");
        System.out.println("[ SHAKESHACK MENU ]");

        int length = MainMenu.values().length;
        printMainMenuBetween(0, length - 2);
        System.out.println("\n[ ORDER MENU ]");
        printMainMenuBetween(length - 2, length);
    }

    private void printMainMenuBetween(int start, int end){
        MainMenu[] menus = MainMenu.values();
        int space = mainMenuService.getMainMenuMaxNameLength();

        int i = start;
        for(;i < end;i++){
            String name = menus[i].getName();
            String description = menus[i].getDescription();
            System.out.printf("%d. %-"+space+"s | %s\n", i+1, name, description);
        }
    }
}
