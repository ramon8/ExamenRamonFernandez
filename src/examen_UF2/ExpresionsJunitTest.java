package examen_UF2;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class ExpresionsJunitTest {
	

	@Test
	public void testPrimeNumber() {
		Primordial primordial = new Primordial();
		Assert.assertTrue(primordial.get_primordial(8)>200);
		Assert.assertFalse(primordial.get_primordial(6)>30);
		Assert.assertTrue(primordial.get_primordial(2)<=200);
	}
}
