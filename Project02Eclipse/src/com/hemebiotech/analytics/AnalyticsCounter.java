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
 * 
 * @author uguza
 *
 */
public class AnalyticsCounter {
	
	//symptomList = symptomReader.getSymptom();
	
	/**
	 * Description
	 * @param args Array of Strings
	 * @throws Exception generate exception
	 */
	public static void main(String args[])throws Exception {
		/* instantiate an object named symptomReader of type ReadsymptomDataFromFile
		 * use a constructor that allows reading from a path
		 */
            ReadSymptomDataFromFile symptomReader = new ReadSymptomDataFromFile("symptoms.txt");
	
		
	    /* Declare an Arraylist of type String named symptomList
	     * Call the getSymptom method of the symptomReader instantiated object and put it in symptomList
         */
		
	 		List<String> symptomList = symptomReader.getSymptoms();//in ISymptomReader
		
	 		// Create an object to count symptoms
	 		ICountSymptoms symptomCounter = new CountSymptoms(); 
	 		Map<String,Integer> symptomTable = symptomCounter.symptomsCounter(symptomList);
	 		
	 		// creates the symptomsWriter object to write the symptoms to a file
	 		ISymptomsWriter symptomsWriter = new SymptomsWriter();
	 		// instantiate the method
	 		symptomsWriter.writeSymptoms(symptomTable);
	}
}