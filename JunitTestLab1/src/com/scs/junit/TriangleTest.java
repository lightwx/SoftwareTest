package com.scs.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	public Triangle tri;

	@Test

	public void testEquilateral() {

	tri = new Triangle();

	assertEquals("Equilateral",tri.Equilateral(2, 2, 2));
	assertEquals("Equilateral",tri.Equilateral(3, 3, 3));
	assertEquals("Equilateral",tri.Equilateral(4, 4, 4));

	}

	 
	@Test

	public void testIsosceles() {

	tri = new Triangle();

	assertEquals("Isosceles",tri.Isosceles(4, 4, 3));

	}

	 

	@Test

	public void testScalene() {

	tri = new Triangle();

	assertEquals("Ordinary",tri.Ordinary(2, 4, 5));

	}

}
