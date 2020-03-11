import java.util.Scanner;

public class Student {
private String firstName;
private String lastName;
private double grade;
private int level;


public void setFirstName(String firstName){
	this.firstName = firstName;
}
public void setLastName(String lastName){
	this.lastName = lastName;
}
public void setGrade(double grade){
	this.grade = grade;
}
public void setLevel(int level){
	this.level = level;
}

public void promoteToNextLevel(){
	if(grade >= 3.5 && grade <= 5.0){
		level = level+100;
		System.out.printf("%s %s you have been promoted to %d Level \n", firstName, lastName, level);
	} else{
		System.out.printf("%s %s you were not promoted, your level is %d Level \n",firstName, lastName, level);
	}
}

public static void main(String[] args){

	
	Student obj = new Student();

	Scanner input = new Scanner(System.in);

	System.out.print("Enter your firstName: \n");
	String firstName = input.next();
	obj.setFirstName(firstName);

	System.out.print("Enter Your LastName \n");
	String lastName = input.next();
	obj.setLastName(lastName);

	System.out.print("Enter Your grade in decimal (e.g 3.00) \n");
	double grade = input.nextDouble();
	obj.setGrade(grade);

	System.out.print("Enter Your Current Level , e.g 100, 200 \n");
	int level = input.nextInt();
	obj.setLevel(level);

	obj.promoteToNextLevel();
	
    input.close();
}
}