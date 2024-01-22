/*
 * Program Name: RegularPolygonTest.java
 * Author: Julian Fuentes
 * Date Last Updated: 21 January 2024
 * Purpose: This program created 3 regular polygon objects and lists traits about them.
 */

import java.util.*;

public class RegularPolygonTest 
{
	public static void main(String[] args) 
	{
		RegularPolygon polygon1 = new RegularPolygon();
		RegularPolygon polygon2 = new RegularPolygon(6,4);
		RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("Perimeter of polygon1: " + polygon1.getPerimeter());
		System.out.println("Area of polygon1: " + polygon1.getArea());
		System.out.println("Perimeter of polygon2: " + polygon2.getPerimeter());
		System.out.println("Area of polygon2: " + polygon2.getArea());
		System.out.println("Perimeter of polygon3: " + polygon3.getPerimeter());
		System.out.println("Area of polygon3: " + polygon3.getArea());
	}
} 
