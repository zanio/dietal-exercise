import java.util.ArrayList;

public class ArrayClass {


    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<String>();
        names.add("Boy");
        names.add("girl");
        names.add("Animal");
        names.add("Account");
        names.add("Sleep");
        names.add("Fight");

        for(String index: names){
            System.out.printf("value printed to the screen %s%n", index);
        }

        names.forEach((action)->{
            System.out.printf("The Action \t:%d",action);
        });
        
    }
}