package com.indi.maventest.test01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.indi.maven.test01.HelloMaven;

public class TestHelloMaven {
	@Test
	public void testAdd() {
		HelloMaven hm = new HelloMaven();
		int res = hm.add(10, 20);
		assertEquals(30, res);
	}
}
