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

public class WriteFileImpl implements WriteFile {

	@Override
	public void writeNamesToFile(List<NameObj> names) {
		try (BufferedWriter writerBuffer = new BufferedWriter(
				new FileWriter(Constants.PATH.concat(Constants.SORTED_NAMES_LIST_FILE)))) {

			for (NameObj name : names) {
				writerBuffer.write(String.join(Constants.ONE_SPACE, name.getGivenName(), name.getLastName()));
				// writerBuffer.write(name.getGivenName() + " " + name.getLastName());
				writerBuffer.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
