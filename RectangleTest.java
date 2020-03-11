import java.util.Scanner;

public class RectangleTest {

public static void main(String[] args){
	
	Rectangle obj = new Rectangle();
	Scanner input = new Scanner(System.in);

	System.out.print("enter the Length of the rectangle: ");
	int length = input.nextInt();
	obj.setLength(length);

	System.out.print("enter the Breadth of the rectangle: \n");
	int breadth = input.nextInt();
	obj.setBreadth(breadth);

	obj.calcuateReactangleArea();
	obj.calcuateReactanglePerimeter();

	System.out.printf("The Area of the reactangle is %d \n \n",obj.getArea());
	System.out.printf("The Parameter of the rectangle is %d",obj.getPerimeter());
	
    input.close();
}
}