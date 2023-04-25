package main;

/**
 * This class include one method that creates a text file 
 * and prints the sorted names, one in each line. 
 * 
 * @exception It throws an IOException if file cannot be created 
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFile {

	public static void writeNamesToFile(List<NameObj> names) {
		try (BufferedWriter writerBuffer = new BufferedWriter(new FileWriter("src/resources/sorted-names-list.txt"))) {

			for (NameObj name : names) {
				writerBuffer.write(name.getGivenName() +" " + name.getLastName());
				writerBuffer.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
