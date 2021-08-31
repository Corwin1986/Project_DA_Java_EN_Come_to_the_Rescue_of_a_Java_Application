package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/**
 * Description
 * @author uguza
 */
public interface ISymptomsWriter {
	
	void writeSymptoms(Map<String,Integer> symptomTable) throws IOException;
}
