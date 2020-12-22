package by.epam_training.homework02.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ApplianceReader {
	
	public List<String> readFromFile() throws IOException{
		
		List<String> result = new ArrayList<>();
		String line = null;
		File file = new File("src/main/resources/appliances_db.txt");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        line = reader.readLine();
        
        while(line!=null) {
        	if(line.equals("")) {
        		line = reader.readLine();
        		continue;
        	}
        	result.add(line);
        	line = reader.readLine();
        }
        
        reader.close();
        fr.close();
        
        return result;
	}
	
}
