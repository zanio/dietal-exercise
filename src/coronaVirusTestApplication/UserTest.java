package coronaVirusTestApplication;

/*
This is an application that predicts the chance of you been infected with corona virus. This application ask a series of question
which based on the answers provided it can be used to know if you are positive or negative to corona virus.

//How to test the application:
Open the command line and cd to the coronaVirusTestApplication then run javac UserTest.java after which you then run
java UserTest.

Developed By Aniefiok Akpan....

*/

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {

//      get user details:

        Scanner input = new Scanner(System.in);

        System.out.println("\n\n----------------------------------------------------------------------------------------------------------------");
        System.out.println("***Please fill in your Bio data***");
        System.out.println("----------------------------------------------------------------------------------------------------------------");

        System.out.printf("%n%s:", "Name");
        String name1 = input.next();

        System.out.printf("%n%s:", "Age");
        int age1 = input.nextInt();

        System.out.printf("%n%s:", "Gender (Only male or female)");
        String gender1 = input.next();

        User user = new User(name1, age1, gender1);
        user.displayQuestionsAndTrackYesOrNoCounter();
        System.out.println(user);

//        Display all Responses
        System.out.println("\n\n----------------------------------------------------------------------------------------------------------------");
        System.out.println("***See Your responses below for all question asked***");
        System.out.println("----------------------------------------------------------------------------------------------------------------");

        for (String[] index : user.getUserRecord()) {
            System.out.println("\t\t\t\t" + index[0] + " " + "[  " + index[1] + "  ]");
        }
        input.close();

    }

}
