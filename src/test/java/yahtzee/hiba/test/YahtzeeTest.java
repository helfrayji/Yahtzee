package yahtzee.hiba.test;

import static org.junit.Assert.*;

import org.junit.Test;

import yahtzee.hiba.Yahtzee;

public class YahtzeeTest {

	@Test
	public void testLancerDes() {
		int[] des = Yahtzee.lancerDes();
		assertEquals(5, des.length);
		for (int d : des) {
			assertTrue(d >= 1 && d <= 6);
		}
	}

	@Test
	public void testCompterOccurrences() {
		int[] des = {1, 2, 2, 3, 3};
		int[] occurrences = Yahtzee.compterOccurrences(des);
		assertEquals(1, occurrences[0]);
		assertEquals(2, occurrences[1]);
		assertEquals(2, occurrences[2]);
		assertEquals(0, occurrences[3]);
		assertEquals(0, occurrences[4]);
		assertEquals(0, occurrences[5]);
	}

	@Test
	public void testEstYahtzee() {
		int[] des1 = {1, 1, 1, 1, 1};
		assertTrue(Yahtzee.estYahtzee(des1));
		int[] des2 = {1, 2, 3, 4, 5};
		assertFalse(Yahtzee.estYahtzee(des2));
	}

	@Test
	public void testCalculerScore() {
		int[] des1 = {1, 1, 1, 1, 1};
		assertEquals(50, Yahtzee.calculerScore(des1, "Yahtzee"));
		int[] des2 = {1, 2, 3, 4, 5};
		assertEquals(30, Yahtzee.calculerScore(des2, "Petite suite"));
		int[] des3 = {1, 2, 3, 4, 6};
		assertEquals(40, Yahtzee.calculerScore(des3, "Grande suite"));
	}
}
