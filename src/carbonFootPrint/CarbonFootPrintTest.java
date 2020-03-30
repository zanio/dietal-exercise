package carbonFootPrint;

public class CarbonFootPrintTest {
    public static void main(String[] args) {
        try {
            int[] nums = {1,2,3,4,5};
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.printf("%s\t %s","the following error occured",error);
        }
    }
}
