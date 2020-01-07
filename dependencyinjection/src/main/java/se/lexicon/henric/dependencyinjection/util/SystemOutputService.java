package se.lexicon.henric.dependencyinjection.util;

import org.springframework.stereotype.Component;

import se.lexicon.henric.dependencyinjection.models.Student;

@Component
public class SystemOutputService implements SystemOutput {

	
	/**
	 * Method for printing a string
	 * @RETURN void
	 * */
	public void printString(String s){
		System.out.println(s);
	}
	
	
}
