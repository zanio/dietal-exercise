import java.util.Scanner;

public class Rectangle {
private int length;
private int breadth;
private int perimeter;
private int area;


public void setLength(int length){
	this.length = length;
}
public void setBreadth(int breadth){
	this.breadth = breadth;
}
public int getArea(){
	return area;
}
public int getPerimeter(){	
	return perimeter;
}
public int calcuateReactangleArea(){
	int Area = length*breadth;
	this.area = Area;
	return Area;
	
}
public int calcuateReactanglePerimeter(){
	int Perimeter = 2*(length+breadth);
	this.perimeter = Perimeter;
	return Perimeter;
	
}
}