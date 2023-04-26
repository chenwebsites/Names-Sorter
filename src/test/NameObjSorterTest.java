package test;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.NameObjSorter;

class NameObjSorterTest {

	@Test
	void test() {
		List<String> names = Arrays.asList("Marin Alvarez", "Adonis Julius Archer", "Beau Tristan Bentley",
				"Hunter Uriah Mathew Clarke", "Leo Gardner", "Vaughn Lewis", "London Lindsey", "Mikayla Lopez",
				"Janet Parsons", "Frankie Conner Ritter", "Shelby Nathan Yoder");
		NameObjSorter.sortNamesObj(names);
		
	}

}
