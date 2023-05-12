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

	private static ReadFile readFile = new ReadFileImpl();
	private static WriteFile writeFile = new WriteFileImpl();
	private static NameObjParser nameObjParser = new NameObjParserImpl();
	private static NameObjSorter nameObjSorter = new NameObjSorterImpl();
	 

	public static void main(String[] args) {
		String fileName;
		if (args.length > 0 && !args[0].equalsIgnoreCase(Constants.NULL)) {
			fileName = args[0];
		} else {
			fileName = Constants.UNSORTED_NAMES_LIST_FILE;
		}

		List<String> names = readFile.readNamesFromFile(Constants.PATH.concat(fileName));
		List<NameObj> prasedNamesObj = nameObjParser.parseNamestoList(names);
		List<NameObj> sortedNamesObj = nameObjSorter.sortNames(prasedNamesObj);
		writeFile.writeNamesToFile(sortedNamesObj);

		for (NameObj name : sortedNamesObj) {
			System.out.println(name);
		}
	}

}
