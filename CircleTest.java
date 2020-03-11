import java.util.Scanner;

public class CircleTest {

public static void main(String[] args){
	Circle obj = new Circle();
	System.out.println(Circle.pi);
	System.out.print("enter the radius of a circle: ");
	Scanner input = new Scanner(System.in);
	double number_1 = input.nextDouble();
    obj.setRadius(number_1);
	double result = obj.calcuateCircumference();
	System.out.printf("The circumference of the circle is %f",result);
    input.close();
}
}