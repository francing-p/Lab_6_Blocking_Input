import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args){

        // create instances
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int guess = 0; // define variables
        int answer = generator.nextInt(1,11);
        String trash = "";

        do{
            System.out.print("Enter an integer guess between 1-10: ");
            if (in.hasNextInt()) { // check to make sure it is an integer
                guess = in.nextInt();
                in.nextLine(); // clear buffer
                if (guess >= 1 && guess <= 10) { // make sure it's in range
                    if (guess > answer) {
                        System.out.println("Too high. Try again. ");
                    } else if (guess < answer) {
                        System.out.println("Too low. Try again. ");
                    } else {
                        System.out.println("Correct!!");
                    }
                }
                else { // respond if out of range
                    in.nextLine();
                    System.out.println("Out of range. Try again. ");
                }
            }
            else { // respond if invalid input ex. float or String
                trash = in.nextLine();
                System.out.println(trash + " is an invalid input. Try again. ");
            }
        }
        while(guess!=answer); // end once guess is correct
    }
}
