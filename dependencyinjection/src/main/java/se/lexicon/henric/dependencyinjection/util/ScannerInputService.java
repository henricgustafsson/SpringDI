package se.lexicon.henric.dependencyinjection.util;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ScannerInputService implements UserInputService{


    private Scanner scanner;


    public ScannerInputService() {

    }

    

    @Autowired
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }



	public String getString() {
		// TODO Auto-generated method stub
		return null;
	}



	public int getInt() {
		// TODO Auto-generated method stub
		return 0;
	}
}
