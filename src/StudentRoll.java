import java.security.*;
public class StudentRoll{
    // student response array (more typically, input at runtime)
    public static void main(String[] args) {

        int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14 };
        int[] frequency = new int[6];

        for(int feedback=0;feedback < responses.length; ++feedback){
            try{
                ++frequency[responses[feedback]];
            }catch(ArrayIndexOutOfBoundsException error){
                System.out.println("\n"+error+"\n");
            }
        }
         System.out.printf("%s%10s%n", "Rating", "Frequency");
        for(int anwser = 0; anwser< frequency.length;++anwser){
            System.out.printf("%6d%10d%n", anwser, frequency[anwser]);
        }


    }
}