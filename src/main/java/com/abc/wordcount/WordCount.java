package com.abc.wordcount;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class WordCount {
	
	public void  printWordOccurances(String input) {
		HashMap<String, Integer> wordOccurances = null;
		if(input!=null && !input.isEmpty()) {
			wordOccurances = new HashMap<String, Integer>();
			//Replace any comma(,) or period(.) in the input to take care of the sentences ending with comma(,) or period(.)
			input = input.replaceAll(",", " ");
			input = input.replaceAll("\\.", " ");
			//Tokenize the input to get all words
			StringTokenizer tokens = new StringTokenizer(input.trim());
			String word ="";
			//Loop through the list of words and maintain the occurrence of each word in a map
			while(tokens.hasMoreTokens()) {
				word = tokens.nextToken();
				wordOccurances.put(word.toLowerCase().trim(), wordOccurances.getOrDefault(word.toLowerCase().trim(),0)+1);
			}	
			//Sort the Words based on their occurances and print the values
			printMap(sortWordsByCount(wordOccurances));
		}else {
			System.out.println("Input is Empty!!");
		}
		
	}
	
	/**
	 * Print the words based on thier frequency in descending order
	 * @param sortedMap
	 */
	private void printMap(Map<String, Integer> sortedMap) {
		if(sortedMap!=null) {
			sortedMap.forEach((key,val) -> { System.out.println(val + " "+ key);});
		}
		
	}
	/**
	 * Method to sort the words based on their frequency
	 * @param wordOccurances
	 * @return
	 */
	private Map<String, Integer> sortWordsByCount(HashMap<String, Integer>  wordOccurances) {
		if(wordOccurances==null || wordOccurances.isEmpty()) {
			return null;
		}			
		HashMap<String,Integer> wordOccurancesSorted = wordOccurances.entrySet().stream().sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue())).
				collect(Collectors.toMap(
						Map.Entry::getKey,Map.Entry::getValue,(s1,s2) -> s1, LinkedHashMap:: new));			
			
		return wordOccurancesSorted;
	}
	
	public static void main(String[] args) {
		
		if(args.length==1) {
			WordCount wordCount = new WordCount();
			wordCount.printWordOccurances(args[0]);//"This is the test   for THE demo.    for the successful, demo this test has to be successful in the demo using test program");//(args[0]);
		}
		else {
			System.out.println("Invalid Input! provide a valid sentense");
		}
	}

}
