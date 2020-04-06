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
        displayResponse("***Please fill in your Bio data***");

        System.out.printf("%n%s:", "Name".toUpperCase());
        String name1 = input.next();

        System.out.printf("%n%s:", "Age".toUpperCase());
        int age1 = input.nextInt();

        System.out.printf("%n%s:", "Gender (Only male or female)".toUpperCase());
        String gender1 = input.next();


        User user = getUserAndDisplaySurvey(name1, age1, gender1);

        displayResponse("*** See Your responses below for all question asked ***");

        loopAndGetUserResponse(user);
        input.close();

    }

    private static User getUserAndDisplaySurvey(String name1, int age1, String gender1) {
        User user = new User(name1, age1, gender1);
        user.displayQuestionsAndTrackYesOrNoCounter();
        System.out.println(user);
        return user;
    }

    private static void loopAndGetUserResponse(User user) {
        for (String[] index : user.getUserRecord()) {
            System.out.println("\t\t\t\t" + index[0] + " " + "[  " + index[1] + "  ]");
        }
    }

    private static void displayResponse(String s) {
        //        Display all Responses
        System.out.println("\n\n" + User.lineDivider);
        System.out.println(s.toUpperCase());
        System.out.println(User.lineDivider);
    }

}
