import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random number = new Random();
        int thenumber = number.nextInt(10);
        int guess;
        System.out.println("Guess a the right number!");
        System.out.println("1-10!");
        guess = scanner.nextInt();
        if (guess == thenumber) {
            System.out.println("You win!");
        }
        else if (guess < thenumber){
            System.out.println("Too small!Try again!");
        }
        else if (guess > thenumber){
            System.out.println("Too big!Try again!");
        }
    }
}
