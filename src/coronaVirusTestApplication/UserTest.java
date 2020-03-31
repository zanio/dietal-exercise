package coronaVirusTestApplication;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("Aniefiok Akpan", 25, "male");
        user.displayQuestionsAndTrackYesOrNoCounter();
        System.out.println(user);

//        Display all Responses
        System.out.println("\n\n ***See Your response below for all question asked***\n");

        for (String[] index : user.getUserRecord()) {
            System.out.println("\t\t\t\t" + index[0] + " " + "[<<" + index[1] + ">>]");
        }

    }

}
