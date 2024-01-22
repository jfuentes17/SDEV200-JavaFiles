/*
 * Program Name: RegularPolygonTest.java
 * Author: Julian Fuentes
 * Date Last Updated: 21 January 2024
 * Purpose: This program created 3 regular polygon objects and lists traits about them.
 */

import java.util.*;

public class RegularPolygon 
{
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	//These are all the private data fields.
	
	public RegularPolygon() {}
	//This is the n0-arg constructor.
	
	public RegularPolygon(int n, double side) 
	{
		this.n = n;
		this.side = side;
	}
	//This is a constructor that creates the polygon with the number
	//of sides and lengths of the sides.
	
	public RegularPolygon(int n, double side, double x, double y) 
	{
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	//This is the constructor that creates a specific polygon.
	
	public void setN(int n) 
	{
		this.n = n;
	}
	public int getN() 
	{
		return n;
	}
	
	public void setSide(double side) 
	{
		this.side = side;
	}
	public double getSide() 
	{
		return side;
	}
	
	public void setX(double x) 
	{
		this.x = x;
	}
	public double getX() 
	{
		return x;
	}
	
	public void setY(double y) 
	{
		this.y = y;
	}
	public double getY() 
	{
		return y;
	}
	//These are all the getters and setters.
	
	public double getPerimeter() 
	{
		return n*side;
	}
	//This should return the perimeter of the polygon.
	
	public double getArea() 
	{
		return (n * Math.pow(side, 2))/(4 * Math.tan(Math.PI/n));
	}
	//This should return the area of the polygon.
}