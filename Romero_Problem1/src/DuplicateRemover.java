import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover{
  private Set<String>uniqueWords;
  
  public DuplicateRemover() {
	  uniqueWords= new HashSet<>();
  }
  public void remove(String dataFile) {
	  try {
		  Scanner file = new Scanner(new File(dataFile));
		  
		  while(file.hasNext()) {
			  uniqueWords.add(file.next());
		  }
		  file.close();
	      }catch(FileNotFoundException e) {
	    	  System.out.println(e);
	      }
        }
   public void write(String outputFile) {
	   try {
		   PrintWriter PT= new PrintWriter(new File(outputFile));
		   
		   for(String string : uniqueWords) {
			   PT.println(string);
		   }
		   PT.flush();
		   PT.close();
	   }catch(FileNotFoundException e) {
		   System.out.println(e);
		   
	   }
   }
}