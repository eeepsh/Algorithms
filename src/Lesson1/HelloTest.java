package Lesson1;


import org.junit.Test;

import org.junit.Assert;

public class HelloTest {

	@Test
	public void test() {
		Assert.assertEquals(new Hello().displayHello(), "Hello");
	}

}
