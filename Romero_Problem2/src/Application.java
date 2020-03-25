
public class Application {
	private static final String Input_File = "problem2.txt";
	private static final String Output_File = "unique_word_counts.txt";
	
	public static void main(String[]args) {
     DuplicateCounter duplicateCounter = new DuplicateCounter();
     duplicateCounter.count(Input_File);
     duplicateCounter.write(Output_File);
}
}
