package coronaVirusTestApplication;

/*
This is an application that predicts the chance of you been infected with corona virus. This application ask a series of question
which based on the answers provided it can be used to know if you are positive or negative to corona virus.

//How to test the application:
Open the command line and cd to the coronaVirusTestApplication then run javac UserTest.java after which you then run
java UserTest.

Developed By Aniefiok Akpan....

*/

public class UserTest {
    public static void main(String[] args) {
        User user = new User("Aniefiok Akpan", 50, "male");
        user.displayQuestionsAndTrackYesOrNoCounter();
        System.out.println(user);

//        Display all Responses
        System.out.println("\n\n ***See Your responses below for all question asked***\n");

        for (String[] index : user.getUserRecord()) {
            System.out.println("\t\t\t\t" + index[0] + " " + "[<<" + index[1] + ">>]");
        }

    }

}
