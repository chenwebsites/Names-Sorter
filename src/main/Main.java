package main;

import java.io.IOException;
import java.util.List;

/**
 * The Main class is the entry point of the application that reads list of names
 * from a file, sorts the names by given name and last name, writes the sorted
 * names to a file and prints it to the console The application accepts one
 * argument from command-line which is the name of the file that includes the
 * unsorted names. The file of the unsorted name must be located in the
 * following path "src/resources/file.txt"
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		String fileName;
		if (args.length > 0 && !args[0].equalsIgnoreCase("null")) {
			fileName = args[0];
		} else {
			fileName = "unsorted-names-list.txt";
		}

		List<String> names = ReadFile.readNamesFromFile("src/resources/" + fileName);

		NameSorter.byGivenName(names);
		NameSorter.byLastName(names);

		WriteFile.writeNamesToFile(names);

		for (String name : names) {
			System.out.println(name);
		}
	}

}
