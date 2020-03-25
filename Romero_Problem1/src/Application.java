import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {
	
	public static void main(String[] args) {
		
		DuplicateRemover DR = new DuplicateRemover();
		
		DR.remove("problem1.txt");
		DR.write("unique_words.txt");
	}

}