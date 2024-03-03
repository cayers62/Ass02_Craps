import java.util.Random;
import java.util.Scanner;

public class Ass02_Craps
{
    public static void main(String[] args)
    {
      // Declare variables and create random generator
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int crapsRoll = die1 + die2;
        int point = crapsRoll;
        boolean done = true;
        String quit = "";

    do {
        System.out.println("\nDie 1" + "Die2" + "Craps Roll" + "Point");

        System.out.println("Your roll is " + die1 + die2 + crapsRoll);

        if (crapsRoll == 11) {
            System.out.println("\nYou win");


        }
        if (crapsRoll > 11) {
            System.out.println("Sorry you crapped out");

        } else if (crapsRoll == 7) {

            System.out.println("\nYou win");


        }
        if (crapsRoll != 7) {
            if (crapsRoll <= 10) {

            }
            System.out.println("Your point value is: " + point);

        } else if (done = in.hasNextLine()){

            System.out.println("Would you like to play again Y/N");

            quit.equalsIgnoreCase("N");
            done = true;

        }
    }while(!(done));


    }










    }

