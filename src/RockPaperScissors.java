import javax.swing.JOptionPane;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        int randomNumber = (int)(Math.random()*3);
        Scanner sc = new Scanner(System.in);
        String playerInput = sc.nextLine();
        //sc.reset();

        String datorInput = "";

        switch(randomNumber){
            case 0:
                datorInput += "Rock";
                break;
            case 1:
                datorInput += "Paper";
                break;
            case 2:
                datorInput += "Scissors";
                break;
        }
        System.out.println("Du valde " + playerInput + " datorn valde " + datorInput);
        //JOptionPane.showMessageDialog(null, "Du valde " + playerInput + " datorn valde " + datorInput);


        if(playerInput.equals(datorInput)){
            System.out.println("draw!");
            //JOptionPane.showMessageDialog(null, "Draw!");
        }
        else if(playerInput.equals("Rock") && datorInput.equals("Paper")){
            System.out.println("Lose!");
            //JOptionPane.showMessageDialog(null, "Lose!");
        }
        else if (playerInput.equals("Rock") && datorInput.equals("Scissors")){
            System.out.println("Win!");
            //JOptionPane.showMessageDialog(null, "Win!");
        }
        else if(playerInput.equals("Paper") && datorInput.equals("Rock")){
            System.out.println("Win!");
            //JOptionPane.showMessageDialog(null, "Win!");
        }
        else if(playerInput.equals("Paper") && datorInput.equals("Scissors")){
            System.out.println("Lose!");
            //JOptionPane.showMessageDialog(null, "Lose!");
        }
        else if(playerInput.equals("Scissors") && datorInput.equals("Rock")){
            System.out.println("Lose!");
            //JOptionPane.showMessageDialog(null, "Lose!");
        }
        else if(playerInput.equals("Scissors") && datorInput.equals("Paper")){
            System.out.println("Win!");
            //JOptionPane.showMessageDialog(null, "Win!");
        }
        else {
            System.out.println("draw");
        }


    }
}
