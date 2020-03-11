
import java.util.Scanner;

public class JavaGetinput{
    public static void main (String[] argv){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose any number");
        int getNumber1 = input.nextInt();
        System.out.println("Choose another number");

        int getnumber2 = input.nextInt();
        if(getNumber1 > getnumber2){
            System.out.printf("%d Is greater than %d", getNumber1, getnumber2);
        }
        input.close();
    }
}

