import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int randomNumber = rand.nextInt(100) + 1;

        System.out.println(randomNumber);
        while (true) {

            count++;

            System.out.println("Enter your guess(1-100): ");

            int playerGuess = sc.nextInt();
            if (playerGuess == randomNumber) {
                System.out.println("Correct!! You Win");
                System.out.println("It took you "+ count+" tries");
                break;
            } else if (randomNumber > playerGuess) {
                System.out.println("NO!! The Number is Higher. Guess again.");
            } else {
                System.out.println("NO!! The Number is Lower. Guess again!");
            }
        }

        

    }
}