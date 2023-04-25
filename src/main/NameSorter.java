package main;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * The NameSorter class contains methods for sorting a List of names by either
 * last name or given name.
 */
public class NameSorter {

	/**
	 * Sorts a List of names by last name.
	 *
	 * @param names the List of names to be sorted
	 */

	public static void byLastName(List<String> names) {
		Comparator<String> byLastName = Comparator.comparing(name -> name.split(" ")[name.split(" ").length - 1]);
		names.sort(byLastName);
	}

	/**
	 * A Comparator for comparing names based on their given names. The first three
	 * given names are used for comparison then sorts a List of names by given name.
	 * 
	 * @param names the List of names to be sorted
	 */
	public static void byGivenName(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String name1, String name2) {
				String[] splitedNames1 = name1.split(" ");
				String[] splitedNames2 = name2.split(" ");

				int givenNames1 = Math.min(splitedNames1.length - 1, 3);
				int givenNames2 = Math.min(splitedNames2.length - 1, 3);

				for (int i = 0; i < givenNames1 && i < givenNames2; i++) {
					int comparedNames = splitedNames1[i].compareTo(splitedNames2[i]);
					if (comparedNames != 0) {
						return comparedNames;
					}
				}
				return Integer.compare(givenNames1, givenNames2);
			}
		});

	}

	/**

	 */

}
