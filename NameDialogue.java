import javax.swing.JOptionPane;
import java.lang.*;

public class NameDialogue {
    public static void main(String[] args){

        try{
        // Prompt the user to display name:
        String name = JOptionPane.showInputDialog("What is your name");
        // Prompt the user to display number:
        String stringNumber = JOptionPane.showInputDialog("choose a number");
        
        int number_1 = Integer.parseInt(stringNumber) ;

        // show dialogue
        String message = String.format("Welcome %s welcome to java your number, '%d'",name, number_1);
            // show dialogue
        JOptionPane.showMessageDialog(null, message);

        } catch(NumberFormatException error){
            // show dialogue
            JOptionPane.showMessageDialog(null, "error in input"+error);

        }
            
        
    }
}