import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class DuplicateCounter {
	
	private Integer wordCounter;
	private Map<String,Integer>map;
	
public DuplicateCounter() {
	this.wordCounter = 0;
	this.map = new HashMap<>();
}
public void count(String dataFile) {
	Scanner fileR;
	try {
		fileR = new Scanner(new File(dataFile));
		while(fileR.hasNextLine())
		{
			String line = fileR.nextLine().trim();
			String[] data = line.split("[\\W]+");
			for(String word:data)
			{
			 this.wordCounter = map.get(word);
			 this.wordCounter = (this.wordCounter==null)?1:++this.wordCounter;
			 map.put(word,this.wordCounter);
			}
		    }
fileR.close();		
}catch(FileNotFoundException fnfe) {
	System.out.println(" File that was entered "+dataFile+" couldn't found! ");
	System.exit(1);
}
}

public void write (String outputFile)
{
	FileWriter FW;
	PrintWriter PW;
	try {
		FW = new FileWriter(new File(outputFile));
		PW = new PrintWriter(FW);
		for(Map.Entry<String,Integer>entry:map.entrySet())
		{
			PW.write(entry.getKey()+" shows up "+entry.getValue()+" times "+System.lineSeparator());
		}
		System.out.println("Data was written into file:"+outputFile);
		PW.flush();
		FW.close();
		PW.close();
	} catch(IOException ex) {
		System.out.println("Error in writing it to" + outputFile + ":" + ex.getMessage());
	}
}
}

