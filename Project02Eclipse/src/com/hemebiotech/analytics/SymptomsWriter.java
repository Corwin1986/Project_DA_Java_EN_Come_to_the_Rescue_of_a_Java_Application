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
 * 
 * @author uguza
 *
 */
public class SymptomsWriter implements ISymptomsWriter{

	@Override
	public void writeSymptoms(Map<String, Integer> symptomTable) throws IOException {
		// TODO Auto-generated method stub
		List<String> keys= new ArrayList<String> (symptomTable.keySet());
		//7 r�cup�rer liste des cl�es de symptomTable
	    //8 Tri� la liste par ordre alphab�tique
				
				Collections.sort(keys);
				
		//9 Cr�er le fichier result.out avec BufferedWritter
				
		        BufferedWriter writer = new BufferedWriter (new FileWriter("results.out"));
		        writer.write("");;
		
		//10 r�cup�rer les valeurs des symptoms tri�s avec for
		
		       for (String symptomTrie : keys) {
				Integer symptomTrieValue= symptomTable.get(symptomTrie);
				
				String resultat= symptomTrie+"="+symptomTrieValue;
				
		// 11 �crire le r�sultat dans le fichier results.out
				
				writer.append(resultat);
				writer.newLine();
		       }
		//12 �crire le fichier final
				writer.close();
	}
	
	
}
