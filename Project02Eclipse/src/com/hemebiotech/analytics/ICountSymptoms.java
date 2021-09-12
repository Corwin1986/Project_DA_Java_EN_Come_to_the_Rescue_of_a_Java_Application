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
 * Anything that will counts the number of occurrences per symptom this
 * interface create a map with string and integer for counting
 * 
 * @author uguza
 *
 */
public interface ICountSymptoms {
	/**
	 * creation of a map with strings and integers to count the number of
	 * repetitions by symptom
	 * 
	 * @param symptomList string
	 * @return type of return, map with value (string and integer)
	 */
	Map<String, Integer> symptomsCounter(List<String> symptomList);

}
