package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Anything that will write the symptom file sorted alphabetically and counted
 * it is important to resume symptomTable with strings and integers we must
 * include the exceptions
 * 
 * @author uguza
 */
public interface ISymptomsWriter {

	/**
	 * @param symptomTable
	 */
	void writeSymptoms(Map<String, Integer> symptomTable);

}
