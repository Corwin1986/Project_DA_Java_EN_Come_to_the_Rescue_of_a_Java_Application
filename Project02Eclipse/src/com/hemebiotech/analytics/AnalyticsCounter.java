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
	 * Déscription
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[])throws Exception {
	/*	/* 1 instancier un objet nommé symptomReader de type ReadsymptomDataFromFile
		 * en utilisant le constructeur qui permet de lire a partir d'un chemin
		 */
            ReadSymptomDataFromFile symptomReader = new ReadSymptomDataFromFile("symptoms.txt");
	
		
		    // 2.0 Déclarer une Arraylist de type String nommé symptomList	
	        //2.1 Appeler la méthode getSymptom de l'objet instancié symptomReader et le mettre dans symptomList
		
	 		List<String> symptomList = symptomReader.getSymptoms();//dans ISymptomReader
		
	 		// Cree un objet pour compter les symptomes
	 		ICountSymptoms symptomCounter = new CountSymptoms(); 
	 		Map<String,Integer> symptomTable = symptomCounter.symptomsCounter(symptomList);
	 		
	 		// crée l'objet symptomsWriter pour écrire les symptoms dans un fichier
	 		ISymptomsWriter symptomsWriter = new SymptomsWriter();
	 		// appéler la méthode
	 		symptomsWriter.writeSymptoms(symptomTable);
		
			
	 		
		/*Travail d'Alex
		 * int i = 0;	// set i to 0
		int headCount = 0;	// counts headaches
		while (line != null) {
			i++;	// increment i
			System.out.println("symptom from file: " + line);
			if (line.equals("headache")) {
				headCount++;
				System.out.println("number of headaches: " + headCount);
			}
			else if (line.equals("rush")) {
				rashCount++;
			}
			else if (line.contains("pupils")) {
				pupilCount++;
			}

			line = reader.readLine();	*8
		}
		*/
		// next generate output
		/*FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
		*/
	}
}