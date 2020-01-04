package se.lexicon.henric.dependencyinjection.config;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ScannerConfig {

	@Bean
	public Scanner scannerBean() {
		return new Scanner(System.in);
	}
}
