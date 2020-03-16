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

        System.out.printf("The size of the array is %d%n", names.size());
        //  Implementing loop with for Loop:
        for(String index: names){
            System.out.printf("value printed to the screen %s%n", index);
        }

        // Implementing loop with forEach:
        
        names.forEach((action)->{
            System.out.printf("The Action \t:%d",action);
        });

        // Implementing loop with While loop

        int counter = 0;

        while(counter < names.size()){
            System.out.printf("\t The Action :%s%n", names.get(counter));
            counter++;

        }
        
    }
}