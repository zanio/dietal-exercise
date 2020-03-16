public class StudentRoll{
    // student response array (more typically, input at runtime)
    public static void main(String[] args) {
        int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14 };
        int[] frequency = new int[6];

        for(int feedback=0;feedback < responses.length; ++feedback){
            try{
                ++frequency[responses[feedback]];
            }catch(ArrayIndexOutOfBoundsException error){

            }
        }

        System.out.println(frequency);

    }
}