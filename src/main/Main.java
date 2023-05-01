package main;

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

	public static void main(String[] args) {
		String fileName;
		if (args.length > 0 && !args[0].equalsIgnoreCase("null")) {
			fileName = args[0];
		} else {
			fileName = "unsorted-names-list.txt";
		}

		List<String> names = ReadFile.readNamesFromFile("src/resources/" + fileName);

		// NameSorter class exists in the package but currently not in use
		// since now I store the list of names as an object, sort it and prints it to a
		// file and on the console.
		// NameSorter.byGivenName(names);
		// NameSorter.byLastName(names);

		List<NameObj> sortedNamesObj = NameObjSorter.sortNamesObj(names);

		WriteFile.writeNamesToFile(sortedNamesObj);

		for (NameObj name : sortedNamesObj) {
			System.out.println(name);
		}
	}

}
