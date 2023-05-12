package main;

/**
 * This class include one method that reads a text file 
 * and add each line as an entry of name in a list of strings 
 * 
 * @exception It throws an IOException if file is not found 
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileImpl implements ReadFile {

	@Override
	public List<String> readNamesFromFile(String fileName) {
		List<String> names = new ArrayList<>();

		try (BufferedReader buffer = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = buffer.readLine()) != null) {
				names.add(line);
			}
		} catch (IOException e) {
			System.out.println("Could not read file");
			e.printStackTrace();
		}
		return names;
	}
}
