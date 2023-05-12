package main;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * The NameObjSorter is an improved class to sort the List<NameObj> of names as
 * an object.
 */

public class NameObjSorterImpl implements NameObjSorter {

	@Override
	public List<NameObj> sortNames(List<NameObj> unsortedNameList){
		
		Collections.sort(unsortedNameList,new Comparator<NameObj>(){
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
