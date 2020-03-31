package coronaVirusTestApplication;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("Aniefiok Akpan", 25, "male");
        System.out.println(user);

        user.displayQuestionsAndTrackYesOrNoCounter();

        System.out.println(user);

        for (String[] index : user.getUserRecord()) {
            System.out.println(index[0] + " " + index[1]);
        }


    }

}
