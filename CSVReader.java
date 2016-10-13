package practice_1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CSVReader {
	
	String[] countryNames;
	int[] yearLabels;
	double[][] cellularDataTable;
	int numberOfCountries;
	
	
	CSVReader(String file) throws IOException{
		File newFile = new File(file);
		Scanner input = new Scanner(newFile);
		
		String currentLine = input.nextLine();
	}
	
	public String[] getCountryNames(){
		return countryNames;
	}
	
	public int[] getYearLabels(){
		return yearLabels;
	}
	
	public double[][] getParsedTable(){
		return cellularDataTable;
	}

}
