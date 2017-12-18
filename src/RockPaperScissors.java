import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){

        boolean playing = true; // Sparar en sann eller falsk variabel för att använda till loopen.


        while (playing) { //En loop för att kunna spela igen.

            Random rndm = new Random();
            int randomNumber = rndm.nextInt(3); // genererar ett sudo-random nummer mellan 0 och 2.
            Scanner sc = new Scanner(System.in); // Läser av konsoll inputs med hjälp av scanner classen.

            System.out.println("Rock, Paper, Scissors");
            String playerInput = sc.nextLine(); // Sparar nästa rad i Konsollen till variabeln playerInputs.
            playerInput = playerInput.substring(0,1).toUpperCase() + playerInput.substring(1); //Gör playerInput till stor bokstav på första bokstaven.

            String datorInput = ""; // Gör en variabel av typen String att spara datorns input i.

            switch(randomNumber){ // Tar randomNummer och kollar om det ä sten, papper eller, sax och spara rätt i datorInputs.
                case 0: // Om det ä 0
                    datorInput += "Rock"; // Spara i datorInputs
                    break; // Avsluta switch satsen.
                case 1:
                    datorInput += "Paper";
                    break;
                case 2:
                    datorInput += "Scissors";
                    break;
            }

            System.out.println("Du valde " + playerInput + " datorn valde " + datorInput);

            if(playerInput.equalsIgnoreCase(datorInput)){ //Om playerinputs är samma som datorns.
                System.out.println("Draw!");
                //JOptionPane.showMessageDialog(null, "Draw!");
            }
            else if(playerInput.equalsIgnoreCase("Rock") && datorInput.equals("Paper")){ // Annars om player ä Rock och datorns ä Paper.
                System.out.println("Lose!");
                //JOptionPane.showMessageDialog(null, "Lose!");
            }
            else if (playerInput.equalsIgnoreCase("Rock") && datorInput.equals("Scissors")){ // Samma fast med resten
                System.out.println("Win!");
                //JOptionPane.showMessageDialog(null, "Win!");
            }
            else if(playerInput.equalsIgnoreCase("Paper") && datorInput.equals("Rock")){
                System.out.println("Win!");
                //JOptionPane.showMessageDialog(null, "Win!");
            }
            else if(playerInput.equalsIgnoreCase("Paper") && datorInput.equals("Scissors")){
                System.out.println("Lose!");
                //JOptionPane.showMessageDialog(null, "Lose!");
            }
            else if(playerInput.equalsIgnoreCase("Scissors") && datorInput.equals("Rock")){
                System.out.println("Lose!");
                //JOptionPane.showMessageDialog(null, "Lose!");
            }
            else if(playerInput.equalsIgnoreCase("Scissors") && datorInput.equals("Paper")){
                System.out.println("Win!");
                //JOptionPane.showMessageDialog(null, "Win!");
            }
            else { // Annars så har man skrivit fel och kommer hit.
                System.out.println("Det du har skrivit finns inte, du kan antingen kan du ha stavat fel eller så har du kanske skrivit på svenska.");
            }

            boolean playAgain = true; // Sparar en variabel för att kunna skriva fel i följande loop.

            while (playAgain) { // Loopar en fråga till det svaras ja eller nej.
                sc.reset(); // Resettar scannern för att ha den tom när vi tar ut en rad.
                System.out.println("Vill du spela igen, Ja/Nej?");
                playerInput = sc.nextLine().toUpperCase(); //Tar ut en rad och gör den helt till uppercase och sparar den i playerIputs.
                if(playerInput.equals("JA")){ // Om ja
                    playAgain = false; // Gå ur den här loopen och fortsätt från början.
                }else if(playerInput.equals("NEJ")){ // Om nej
                    playAgain = false;
                    playing = false; // Gå ur den här loopen och sedan även den första loopen.
                    System.out.println("Ses nästa gång!");
                }else{
                    System.out.println("Skriv ja eller nej"); //örja om i den här till dess att det har svarats ja eller nej.
                }
            }
        }
    }
}
