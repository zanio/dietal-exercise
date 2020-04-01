package coronaVirusTestApplication;

import java.util.Scanner;

public class User implements API {
    private final String name;
    private final int age;
    private String gender;
    private int counterYes = 0;
    private int counterNo = 0;
    private int scorePoint = 0;
    private String[][] userRecord = new String[12][3];

    public User(String name, int age, String gender) {
        this.name = name;
        this.validateUserAge(age);
        this.age = age;
        this.genderValidation(gender);

    }

    private void validateUserAge(int age) {
        if (age < 0)
            throw new IllegalArgumentException("User Age cannot be less than 0");
    }


    private void genderValidation(String gender) {


        if (gender.equals("male"))
            this.gender = gender;
        else if (gender.equals("female"))
            this.gender = gender;
        else throw new IllegalArgumentException("Gender can only be male or female value");
    }

    @Override
    public String toString() {
        return String.format("%n--------------------------------------" +
                        "--------------------------------------------------------------------------" +
                        "%n*** %s%s: " +
                        "*** %n---------------------------------------------------------" +
                        "-------------------------------------------------------%n\t\t%s: %s%n\t\t%s: " +
                        "%d%n\t\t%s: %s%n\t\t%s: %d%n\t\t%s: %d%n%n\t\t%s",
                "COVID-19 diagnose for ", name, "Name", name, "Age",
                age, "Gender", gender, "Total number of Yes", counterYes, "Total number of Nos", counterNo, this.recommendation());
    }

    public void displayQuestionsAndTrackYesOrNoCounter() {
        System.out.println("\n\n ----------------------------------------------------------------------------------------------------------------");
        System.out.println("Please answer the following question ( YES OR NO ) " +
                "so that we can predict if you have corona virus or not");
        System.out.println("----------------------------------------------------------------------------------------------------------------");


        for (int i = 0; i < data.length; i++) {
            System.out.printf("%s ? :", data[i][0]);
            Scanner input = new Scanner(System.in);
            String yesOrNo = input.next().toLowerCase();
            if (data[i][1].equals(yesOrNo) || data[i][2].equals(yesOrNo)) {
                if (yesOrNo.equals("yes")) {
                    counterYes++;
                    userRecord[i][0] = data[i][0];
                    userRecord[i][1] = yesOrNo;
                    scorePoint = scorePoint + Integer.parseInt(data[i][3]);
                }
                if (yesOrNo.equals("no")) {
                    counterNo++;
                    userRecord[i][0] = data[i][0];
                    userRecord[i][1] = yesOrNo;

                }
            }

        }
    }

    public String[][] getUserRecord() {
        return userRecord;
    }

    public String recommendation() {
        if (scorePoint <= 2)
            return String
                    .format("%n\t\t%s: %d%n\t\t%s: %s", "Total Points".toUpperCase(), scorePoint,
                            "Recommendation".toUpperCase(), "Maybe Stress related an Observe");
        else if (scorePoint > 3 && scorePoint <= 5 || scorePoint == 3)
            return String
                    .format("%n\t\t%s: %d%n\t\t%s: %s", "Total Points".toUpperCase(), scorePoint, "Recommendation".toUpperCase(), "" +
                            "Hydrate properly and proper personal hygiene. Observe and reevaluate after 2days");
        else if (scorePoint <= 12)
            return String
                    .format("%n\t\t%s: %d%n\t\t%s: %s", "Total Points".toUpperCase(), scorePoint, "Recommendation".toUpperCase(), "" +
                            "Seek a consultation with Doctor");
        else
            return String
                    .format("%n\t\t%s: %d%n\t\t%s: %s", "Total Points".toUpperCase(), scorePoint, "Recommendation".toUpperCase(),
                            "CALL THE NCDC HOTLINE 0800 9700 0010");

    }
}
