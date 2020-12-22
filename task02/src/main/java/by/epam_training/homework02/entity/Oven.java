package by.epam_training.homework02.entity;

import by.epam_training.homework02.entity.criteria.SearchCriteria;

import java.util.Map;
import java.util.Objects;

public class Oven extends Appliance{
    private int powerConsumption;
    private int weight;
    private int capacity;
    private int depth;
    private double height;
    private double width;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void setParameters(Map<String, Object> list){
        powerConsumption = Integer.parseInt((String) list.get(SearchCriteria.Oven.POWER_CONSUMPTION.toString()));
        weight = Integer.parseInt((String) list.get(SearchCriteria.Oven.WEIGHT.toString()));
        capacity = Integer.parseInt((String) list.get(SearchCriteria.Oven.CAPACITY.toString()));
        depth = Integer.parseInt((String) list.get(SearchCriteria.Oven.DEPTH.toString()));
        height = Double.parseDouble((String) list.get(SearchCriteria.Oven.HEIGHT.toString()));
        width = Double.parseDouble((String) list.get(SearchCriteria.Oven.WIDTH.toString()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oven oven = (Oven) o;
        return powerConsumption == oven.powerConsumption &&
                weight == oven.weight &&
                capacity == oven.capacity &&
                depth == oven.depth &&
                Double.compare(oven.height, height) == 0 &&
                Double.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, capacity, depth, height, width);
    }

    @Override
    public String toString() {
        return "Oven{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
