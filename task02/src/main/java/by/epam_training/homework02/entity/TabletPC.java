package by.epam_training.homework02.entity;

import by.epam_training.homework02.entity.criteria.SearchCriteria;

import java.util.Map;
import java.util.Objects;

public class TabletPC extends Appliance {
    private int batteryCapacity;
    private int displayINCHS;
    private int memoryROM;
    private int flashMemoryCapacity;
    private String color;

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayINCHS() {
        return displayINCHS;
    }

    public void setDisplayINCHS(int displayINCHS) {
        this.displayINCHS = displayINCHS;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setParameters(Map<String, Object> list){
        batteryCapacity = Integer.parseInt((String) list.get(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString()));
        flashMemoryCapacity = Integer.parseInt((String) list.get(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString()));
        memoryROM = Integer.parseInt((String) list.get(SearchCriteria.TabletPC.MEMORY_ROM.toString()));
        color = (String) list.get(SearchCriteria.TabletPC.COLOR.toString());
        displayINCHS = Integer.parseInt((String) list.get(SearchCriteria.TabletPC.DISPLAY_INCHES.toString()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Float.compare(tabletPC.batteryCapacity, batteryCapacity) == 0 &&
                displayINCHS == tabletPC.displayINCHS &&
                memoryROM == tabletPC.memoryROM &&
                flashMemoryCapacity == tabletPC.flashMemoryCapacity &&
                Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, displayINCHS, memoryROM, flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayINCHS=" + displayINCHS +
                ", memoryROM=" + memoryROM +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                '}';
    }
}