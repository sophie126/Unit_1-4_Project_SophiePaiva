import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        int newGuess = 0;

        System.out.println("I'm going to guess your number! \n");


        Scanner userInput = new Scanner(System.in);
        System.out.println("What should the minimum be?");
        int min = userInput.nextInt();
        System.out.println("What should the maximum be?");
        int max = userInput.nextInt();
        Guesser guesser = new Guesser(min, max);
        newGuess = guesser.returnGuess();
        System.out.println("Press enter when done");
        String doneOrNot = userInput.nextLine();


        System.out.println(guesser);
        String wrongOrRight = userInput.nextLine();


        while (!wrongOrRight.equals("yes")) {
            if (wrongOrRight.equals("too low") || wrongOrRight.equals("too high")) {
                if (wrongOrRight.equals("too low")) {
                    min = newGuess + 1;
                }
                if (wrongOrRight.equals("too high")) {
                    max = newGuess - 1;
                }
                newGuess = guesser.tooHighOrLow( min, max);
                System.out.println(guesser);
                guesser.increaseCount();
                wrongOrRight = userInput.nextLine();
            } else {
                System.out.println("Enter \"yes\", \"too low\", or \"too high\"");
                wrongOrRight = userInput.nextLine();
            }
        }
        int count = guesser.returnCount();
        String congrats = "That took " + count + " tries";
        if (count < 6) {
            congrats += ". Wow! I did better than I though I would.";
        } else {
            count--;
            congrats += ". I kinda suck at this. Next time I'll try to get it down to " + count + ".";
        }
        System.out.println(congrats);
    }
}
