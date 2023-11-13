/**
 * @Author Tyler Black, Marjorie Pare, Aaron Brown, Emma Burger, Jameson Baltzer
 * @Purpose
 * @Date
 * @Section
 */
import java.util.Scanner;
public class GameDriver {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our game");
        System.out.println("Would you like to play a new game? (Y for yes N for no) ")
        String answer = input.nextLine();
        boolean flag = false;
        if (answer.equals("Y") || answer.equals("y"){
            flag = true;
            //start game
        }
        //print the array of the characters to the screen
        System.outprintln("")
        System.out.println("Please enter a character you would like to use");
        String player1 = input.nextLine();
    }
}
