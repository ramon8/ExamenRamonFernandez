package examen_UF2;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class ExceptionJunitTest {
	

	@Test (expected = IllegalArgumentException.class)
	public void testPrimeNumber() {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrime(-8);
	}
}
