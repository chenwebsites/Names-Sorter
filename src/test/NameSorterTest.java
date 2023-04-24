package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.NameSorter;

class NameSorterTest {

	@Test
	public void testByLastName() {
		List<String> names = new ArrayList<>();
		names.add("Shelby Nathan Yoder");
		names.add("Leo Gardner");
		names.add("Marin Alvarez");
		names.add("Mikayla Lopez");

		NameSorter.byLastName(names);

		assertEquals("Marin Alvarez", names.get(0));
		assertEquals("Leo Gardner", names.get(1));
		assertEquals("Mikayla Lopez", names.get(2));
		assertEquals("Shelby Nathan Yoder", names.get(3));
	}

	@Test
	public void testByGivenName() {
		List<String> names = new ArrayList<>();
		names.add("Alice Smith");
		names.add("Hunter Briah Mathew Clarke");
		names.add("Hunter Ariah Mathew Clarke");
		names.add("David Lee");

		NameSorter.byGivenName(names);

		assertEquals("Alice Smith", names.get(0));
		assertEquals("David Lee", names.get(1));
		assertEquals("Hunter Ariah Mathew Clarke", names.get(2));
		assertEquals("Hunter Briah Mathew Clarke", names.get(3));
	}

	@Test
	public void testFullNameBasedOnPdfSortedNames() {
		List<String> expectedOrder = Arrays.asList("Marin Alvarez", "Adonis Julius Archer", "Beau Tristan Bentley",
				"Hunter Uriah Mathew Clarke", "Leo Gardner", "Vaughn Lewis", "London Lindsey", "Mikayla Lopez",
				"Janet Parsons", "Frankie Conner Ritter", "Shelby Nathan Yoder");

		List<String> actualOrder = Arrays.asList("Marin Alvarez", "Adonis Julius Archer", "Beau Tristan Bentley",
				"Hunter Uriah Mathew Clarke", "Leo Gardner", "Vaughn Lewis", "London Lindsey", "Mikayla Lopez",
				"Janet Parsons", "Frankie Conner Ritter", "Shelby Nathan Yoder");

		for (int i = 0; i < expectedOrder.size(); i++) {
			assertEquals(expectedOrder.get(i), actualOrder.get(i));
		}

	}

}
