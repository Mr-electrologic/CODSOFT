import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int score = 0;
        boolean play = true;

        while (play) {
            int randomNumber = rd.nextInt(100) + 1;
            int attempts = 0;

            while (true) {
                System.out.print("Enter a guess between 1 and 100: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (attempts != 5) {
                	if (userGuess < randomNumber) {
                    	System.out.println("Your guess is too low. Trials left: "+(5-attempts));

                    } else if (userGuess > randomNumber) {
                        System.out.println("Your guess is too high. Trials left: "+(5-attempts));
                    } else {
                    	System.out.println("Congratulations... You guessed the correct number");
                        score++;
                        break;
                    }
                }else {
                	System.out.println("You reached the maximum number of attempts.\nThe correct number was " + randomNumber);
                    break;
                }
            }
            System.out.print("Do you want to play again? (y/n): ");
            String response = sc.next();
            play = response.equalsIgnoreCase("y");
        }
        if (score==0) {
            System.out.println("Better luck next time");
        }
        else {
            System.out.println("Your final score is: " + score);

        }
        sc.close();
    }
}