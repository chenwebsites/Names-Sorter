package main;

import java.util.ArrayList;
import java.util.List;

public class NameObjParserImpl implements NameObjParser{

	List<NameObj> unsortedNameList = new ArrayList<>();
	
	@Override
	public List<NameObj> parseNamestoList(List<String> names) {
		for (String name : names) {

			NameObj nameObj = new NameObj();

			String[] splitedParts = name.split(" ");
			String givenNames = name.substring(0, name.lastIndexOf(" "));

			nameObj.setLastName(splitedParts[splitedParts.length - 1]);
			nameObj.setGivenName(givenNames);

			unsortedNameList.add(nameObj);
		}
		return unsortedNameList;
	}
	
}
