package project.hw.data.menu;

public enum MainMenu {
    HAMBURGER("Hamburger", "앵거스 비프 통살을 다져만든 버거"),
    PIZZA( "Pizza", "맛있는 피자"),
    BEER( "Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주"),
    ORDER("Order", "장바구니를 확인 후 주문합니다."),
    CANCEL("Cancel", "진행중인 주문을 취소합니다.");

    private final String name;
    private final String description;

    MainMenu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "MainMenu{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
