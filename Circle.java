import java.util.Scanner;
import java.lang.Math.*;

public class Circle {
private double radius;
static final double pi = Math.PI;


public void setRadius(double radius){
	this.radius = radius;
}
public double calcuateCircumference(){
	double circumference = Math.round( 2*pi*radius*100.0)/100.0;
	return circumference;
	
}
}