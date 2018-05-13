package mocking;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.revature.CalculatorService;
import com.revature.MathApplication;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

	@Mock
	private CalculatorService calcService;

	@InjectMocks
	private MathApplication mathApp = new MathApplication();

	@Test
	public void testAdd() {
		when(calcService.add(10.0, 20.0)).thenReturn(30.0);
		Assert.assertEquals(30.00, mathApp.add(10.0, 20.0), 0.000000001);
	}

}
