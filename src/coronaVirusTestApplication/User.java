package coronaVirusTestApplication;

import java.util.Scanner;

public class User implements API {
    private final String name;
    private final int age;
    private String gender;
    private int counterYes = 0;
    private int counterNo = 0;
    private String[][] userRecord = new String[10][2];

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
        return String.format("%n%n%s:%n%s: %s%n%s: %d%n%s: %s%n%s: %d%n%s: %d", "User Analysis", "Name", name, "Age",
                age, "Gender", gender, "Total number of Yes", counterYes, "Total number of Nos", counterNo);
    }

    public void displayQuestionsAndTrackYesOrNoCounter() {
        System.out.println("\n\n Please answer the following question so that we can predict if you have corona virus or not\n");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%s :", data[i][0]);
            Scanner input = new Scanner(System.in);
            String yesOrNo = input.next().toLowerCase();
            if (data[i][1].equals(yesOrNo) || data[i][2].equals(yesOrNo)) {
                if (yesOrNo.equals("yes")) {
                    counterYes++;
                    userRecord[i][0] = data[i][0];
                    userRecord[i][1] = yesOrNo;
                }
                if (yesOrNo.equals("no")) {
                    counterNo++;
                    userRecord[i][0] = data[i][0];
                    userRecord[i][1] = yesOrNo;

                }
            }

        }
    }

    public int getCounterYes() {
        return counterYes;
    }

    public int getCounterNo() {
        return counterNo;
    }

    public String[][] getUserRecord() {
        return userRecord;
    }
}
