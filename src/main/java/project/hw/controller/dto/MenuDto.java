package project.hw.controller.dto;

public class MenuDto {
    private String name;
    private String description;
    private double cost;
    private int count;

    public MenuDto(String name, String description, double cost, int count) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public int getCount() {
        return count;
    }
}
