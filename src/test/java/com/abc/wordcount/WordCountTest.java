package com.abc.wordcount;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WordCountTest{
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void prindWordFrequencyWithValidInput() {
		WordCount wordCount = new WordCount();		
		wordCount.printWordOccurances("");
		
	}
	
	@Test
	public void prindWordFrequencyWithNoInput() {
		WordCount wordCount = new WordCount();		
		wordCount.printWordOccurances(""); //Provide Input here
		
	}
	
	@Test
	public void prindWordFrequencyWithCommaPeriod() {
		WordCount wordCount = new WordCount();		
		wordCount.printWordOccurances("");//Provide Input here
		
	}
	
	@Test
	public void prindWordFrequencyWithNewLineChars() {
		WordCount wordCount = new WordCount();		
		wordCount.printWordOccurances("");//Provide Input here
		
	}
	@Test
	public void prindWordFrequencyWithTabs() {
		WordCount wordCount = new WordCount();		
		wordCount.printWordOccurances("");//Provide Input here
		
	}
	
	@Test
	public void prindWordFrequencyNospace() {
		WordCount wordCount = new WordCount();		
		wordCount.printWordOccurances("");//Provide Input here
		
	}
	
	
}