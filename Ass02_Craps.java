import java.util.Random;
import java.util.Scanner;

public class Ass02_Craps
{
    public static void main(String[] args)
    {

        // Declare variables and create random generator
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        String replay;

        do {
            System.out.println("Die 1 " + " Die 2 " + " Craps Roll " + " Point");
            System.out.println("____________________________");

            boolean end = false;

            while (!end) {
                int die1 = rnd.nextInt(6) + 1;
                int die2 = rnd.nextInt(6) + 1;
                int crapsRoll = die1 + die2;
                int point = 0;
                int totPoint = point + die1 + die2;

                System.out.printf("%3d %6d %7d %7d\n", die1, die2, crapsRoll, point);

                if (crapsRoll == 7 || crapsRoll == 11) {
                    System.out.println("\nYou win!");
                    end = true;
                } else if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                    System.out.println("Sorry, you crapped out!");
                    end = true;
                } else {
                    if (point >= 0) {
                        point = crapsRoll;
                        System.out.println("Your point value is: " + point);
                    }else if (crapsRoll == totPoint) {
                        System.out.println("You win!");
                        end = true;
                    } else if (crapsRoll == 7) {
                        System.out.println("Sorry, you crapped out!");
                        end = true;
                    }
                }
            }

            System.out.print("Would you like to play again (Y/N)? ");
            replay = in.next();

        } while (replay.equalsIgnoreCase("Y"));

    }
}