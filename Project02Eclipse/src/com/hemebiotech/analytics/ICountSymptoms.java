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
 * description de l'interface
 * @author uguza
 *
 */
public interface ICountSymptoms {
	/**
	 *  description de la m�thode
	 * @param symptomList liste de string 
	 * @return type de return map avec les valeurs (string et integer)
	 */
	Map <String,Integer> symptomsCounter(List<String> symptomList);

}
