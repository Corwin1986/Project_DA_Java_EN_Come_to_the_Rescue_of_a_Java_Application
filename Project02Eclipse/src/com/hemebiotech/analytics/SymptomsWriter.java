package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
public class SymptomsWriter implements ISymptomsWriter{

	@Override
	public void writeSymptoms(Map<String, Integer> symptomTable) throws IOException {
		// TODO Auto-generated method stub
		List<String> keys= new ArrayList<String> (symptomTable.keySet());
		//7 retrieve the list of keys from symptomTable
	    //8 Sort the list alphabetically
				
				Collections.sort(keys);
				
		//9 Create the result.out file with BufferedWritter
				
		        BufferedWriter writer = new BufferedWriter (new FileWriter("results.out"));
		        writer.write("");;
		
		//10 retrieve the values ​​of the symptoms sorted with for
		
		       for (String symptomTrie : keys) {
				Integer symptomTrieValue= symptomTable.get(symptomTrie);
				
				String resultat= symptomTrie+"="+symptomTrieValue;
				
		// 11 write the result in the result.out file results.out
				
				writer.append(resultat);
				writer.newLine();
		       }
				writer.close();
	}
	
	
}
