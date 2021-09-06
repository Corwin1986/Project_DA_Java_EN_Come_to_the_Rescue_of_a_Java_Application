package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Simple brute force implementation
 *
 * @author uguza
 *
 */
 public class CountSymptoms implements ICountSymptoms {

	@Override
	public Map<String, Integer> symptomsCounter(List<String> symptomList) {
		
		
	    // 3 enter a list of symptoms by creating a Hashmap with keys (name of symptoms) and values
	 		
				Map <String,Integer> symptomTable=new HashMap<>();
				
		//4 browse symptoms of symptomList with for
				
				for(String symptom : symptomList) {
					
		//5 if symptom does not exist in the table add it with the value 1
					
					if (symptomTable.containsKey(symptom)==false) {
						symptomTable.put(symptom,1);
					}
					
		//6 else, increase the existing value by 1
					
					else { 
						//Integer freqExistanteSymp = symptomTable.get(symptom);
						symptomTable.put(symptom, symptomTable.get(symptom)+1);
					}
				}
				System.out.println (symptomTable);
				
				return symptomTable;
		
	}
 }

