package by.epam_training.homework02.factory.impl;

import by.epam_training.homework02.entity.*;

public class ApplianceSimpleFactory {
    public Appliance createAppliance(String name){
        switch (name){
            case "Laptop" ->{
                return new Laptop();
            }
            case "Oven" -> {
                return new Oven();
            }
            case "Refrigerator" ->{
                return new Refrigerator();
            }
            case "Speakers" ->{
                return new Speakers();
            }
            case "TabletPC" -> {
                return new TabletPC();
            }
            case "VacuumCleaner" ->{
                return new VacuumCleaner();
            }
        }
        return null;
    }
}
