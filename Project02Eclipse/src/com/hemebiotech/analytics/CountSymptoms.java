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
 * description g�neral de la classe
 * @author uguza
 *
 */
 public class CountSymptoms implements ICountSymptoms {

	@Override
	public Map<String, Integer> symptomsCounter(List<String> symptomList) {
		
		
	    // 3 entr�e une liste de symptoms en cr�ant une Hashmap avec des cl�es (nom des symptoms) et valeurs
	 		
				Map <String,Integer> symptomTable=new HashMap<>();
				
		//4 parcourir les symptoms de symptomList avec une boucle for
				
				for(String symptom : symptomList) {
					
		//5 si symptom n'�xiste pas dans le tableau l'ajouter avec la valeur 1
					
					if (symptomTable.containsKey(symptom)==false) {
						symptomTable.put(symptom,1);
					}
					
		//6 sinon, incr�menter de 1 la valeur existante 
					
					else { 
						//Integer freqExistanteSymp = symptomTable.get(symptom);
						symptomTable.put(symptom, symptomTable.get(symptom)+1);
					}
				}
				System.out.println (symptomTable);
				
				return symptomTable;
		
	}
 }

