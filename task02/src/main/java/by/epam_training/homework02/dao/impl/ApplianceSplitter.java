package by.epam_training.homework02.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import by.epam_training.homework02.entity.criteria.Criteria;

public class ApplianceSplitter {
	public List<Map<String, Object>> splitFileLine(List<String> data, Criteria enterCriteria) {
		
		List<Map<String, Object>> result = new ArrayList<>();
		Map<String, Object> mapDevice;
		String[] deviceInfo;
        String[] parameters;
        String line = null;
		
		for(int i = 0; i < data.size(); i++) {
			line = data.get(i);
			mapDevice = new HashMap<>();
            deviceInfo = line.split(" : ");
            String nameDevice = deviceInfo[0];
            
            if (nameDevice.equalsIgnoreCase(enterCriteria.getGroupSearchName()) || enterCriteria.getGroupSearchName()==null){
                if (!"".equals(nameDevice)){
                    mapDevice.put(enterCriteria.getGroupSearchName(), nameDevice);
                    parameters = deviceInfo[1].split(", ");
                for (String x : parameters) {
                    parameters = x.split("=");
                    mapDevice.put(parameters[0], parameters[1]);
                }
                
                int numberOfMatches = 0;
                boolean outputFromCycle = false;
                for (Map.Entry<String, Object> criteria : enterCriteria.getCriteria().entrySet()) {
                    for (Map.Entry<String, Object> criteriaFromDb : mapDevice.entrySet()) {
                        if (criteria.getKey().equals(criteriaFromDb.getKey())) {
                            if (criteria.getValue().toString().equalsIgnoreCase(criteriaFromDb.getValue().toString())) {
                                numberOfMatches++;
                            }else{
                                outputFromCycle=true;
                            }
                            break;
                        }
                    }
                    if (outputFromCycle){
                        break;
                    }
                }
                if (numberOfMatches == enterCriteria.getCriteria().size()) {
                    result.add(mapDevice);
                }
                }
            }
		}
		
		return result;
	}
}
