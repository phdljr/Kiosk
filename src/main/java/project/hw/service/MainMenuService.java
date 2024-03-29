package project.hw.service;

import project.hw.data.menu.MainMenu;

public class MainMenuService {

    public int getMainMenuLength() {
        return MainMenu.values().length - 3;
    }

    public int getMainMenuMaxNameLength() {
        int maxLength = 0;
        for (MainMenu mainMenu : MainMenu.values()) {
            int length = mainMenu.getName().length();
            if (maxLength < length) {
                maxLength = length;
            }
        }
        return maxLength;
    }
}
