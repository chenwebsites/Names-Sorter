package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameObjSorter {

	static List<NameObj> unsortedNameList = new ArrayList<>();

	public static List<NameObj> sortNamesObj(List<String> names) {
		for (String name : names) {
			NameObj nameObj = new NameObj();
			String[] splitedParts = name.split(" ");
			nameObj.setLastName(splitedParts[splitedParts.length - 1]);
			String givenNames = name.substring(0, name.lastIndexOf(" "));
			nameObj.setGivenName(givenNames);

			unsortedNameList.add(nameObj);
		}

		Comparator<NameObj> byGivenName = (nameObj1, nameObj2) -> {
			int givenNameCompare = nameObj1.getGivenName().compareTo(nameObj2.getGivenName());
			if (givenNameCompare != 0) {
				return givenNameCompare;
			}
			return 0;
		};

		unsortedNameList.sort(byGivenName);
		Collections.sort(unsortedNameList, new Comparator<NameObj>() {

			@Override
			public int compare(NameObj o1, NameObj o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		return unsortedNameList;
	}
}
