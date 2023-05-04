package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * The NameObjSorter is an improved class to sort the List<NameObj> of names as
 * an object.
 */

public class NameObjSorter {

	static List<NameObj> unsortedNameList = new ArrayList<>();

	public static List<NameObj> sortNamesObj(List<String> names) {
		for (String name : names) {

			NameObj nameObj = new NameObj();

			String[] splitedParts = name.split(" ");
			String givenNames = name.substring(0, name.lastIndexOf(" "));

			nameObj.setLastName(splitedParts[splitedParts.length - 1]);
			nameObj.setGivenName(givenNames);

			unsortedNameList.add(nameObj);
		}

		Collections.sort(unsortedNameList, new Comparator<NameObj>() {
			@Override
			public int compare(NameObj o1, NameObj o2) {
				return o1.getGivenName().compareTo(o2.getGivenName());
			}
		});

		Collections.sort(unsortedNameList, new Comparator<NameObj>() {
			@Override
			public int compare(NameObj o1, NameObj o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		return unsortedNameList;
	}
}
