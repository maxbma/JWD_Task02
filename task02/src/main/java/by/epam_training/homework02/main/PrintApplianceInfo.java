package by.epam_training.homework02.main;

import by.epam_training.homework02.entity.Appliance;

import java.util.List;

public class PrintApplianceInfo {

    public static void print(List<Appliance> appliance) {
        if (appliance==null){
            System.out.println("Invalid criteria");
            return;
        }
        if (appliance.isEmpty()){
        System.out.println("\tThere is no such device\n\n");
        return;
        }
        System.out.println("\tResult of Search");
        for(Appliance device : appliance){
            System.out.println(device);
        }
        System.out.println();
        // you may add your own code here
    }
    // you may add your own code here

}
