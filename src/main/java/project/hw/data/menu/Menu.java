package project.hw.data.menu;

import project.hw.controller.dto.MenuDto;

public abstract class Menu implements Cloneable {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    abstract public double getCost();

    public MenuDto toDto() {
        return new MenuDto(getName(), getDescription(), getCost(), 1);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return String.format("Menu{name: %s, description: %s, cost: %.1f}"
                , getName(), getDescription(), getCost());
    }
}
