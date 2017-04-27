package examen_UF2;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedJunitTest {
	private int expected, actual;
	private double delta;
	
	private Primordial primordial;
	
	@Before
	public void initialize() {
		primordial = new Primordial();
	}

	public ParameterizedJunitTest(int expected, int actual, double delta) {
		this.actual = actual;
		this.expected = expected;
		this.delta = delta;
	}
	
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] {
			{2, 2, 0.03},
			{ 6, 3, 0.03},
			{ 6, 4, 0.03},
			{ 30, 5, 0.03},
			{ 210, 7, 0.03},
			{ 2310, 11, 0.03},
			{ 30030, 13, 0.03},
			{ 510510, 17, 0.03},
			{ 9699690, 19, 0.03}	
			//{ 23, 6469693230, 0.03} integer out of range
		});
	}

	@Test
	public void testPrimeNumber() {
		System.out.println("Parameterized Number is : " + actual);
		Assert.assertEquals(expected, primordial.get_primordial(actual), delta);
	}
}
