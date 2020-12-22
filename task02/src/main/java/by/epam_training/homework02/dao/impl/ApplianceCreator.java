package by.epam_training.homework02.dao.impl;

import java.util.*;

import by.epam_training.homework02.entity.Appliance;
import by.epam_training.homework02.factory.impl.ApplianceSimpleFactory;

public class ApplianceCreator {
	
	private ApplianceSimpleFactory factory = new ApplianceSimpleFactory();
	
	public List<Appliance> createAppliances(List<Map<String, Object>> splittedData, String criteriaName){
		
		List<Appliance> result = new ArrayList<>();
		
		Appliance appliance;
      	for (Map<String, Object> device: splittedData) {
            appliance = factory.createAppliance(device.get(criteriaName).toString());
            appliance.setParameters(device);
            result.add(appliance);
        }
		
		return result;
	}
}
