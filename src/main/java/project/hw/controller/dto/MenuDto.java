package project.hw.controller.dto;

public class MenuDto {
    private final String name;
    private final String description;
    private final double cost;
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

    public MenuDto addCount(int count) {
        this.count += count;
        return this;
    }

    @Override
    public String toString() {
        return "MenuDto{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                ", count=" + count +
                '}';
    }
}
