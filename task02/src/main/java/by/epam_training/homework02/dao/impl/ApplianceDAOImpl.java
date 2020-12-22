package by.epam_training.homework02.dao.impl;

import by.epam_training.homework02.dao.ApplianceDAO;
import by.epam_training.homework02.entity.*;
import by.epam_training.homework02.entity.criteria.Criteria;
import java.io.*;
import java.util.*;


public class ApplianceDAOImpl implements ApplianceDAO {
    
    @Override
    public List<Appliance> find(Criteria criteria) throws IOException{

    	ApplianceReader reader = new ApplianceReader();
    	ApplianceSplitter splitter = new ApplianceSplitter();
    	ApplianceCreator creator = new ApplianceCreator();
    	
    	List<String> fileLines = reader.readFromFile();
    	List<Map<String, Object>> receivedDevices = splitter.splitFileLine(fileLines, criteria);
    	List<Appliance> appliances = new ArrayList<>();
    	appliances = creator.createAppliances(receivedDevices, criteria.getGroupSearchName());

        
        return appliances;
    }
}