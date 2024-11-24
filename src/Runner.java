import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        int newGuess = 0;
        int count = 1;


        Scanner userInput = new Scanner(System.in);
        System.out.println("What should the minimum be?");
        int min = userInput.nextInt();
        System.out.println("What should the maximum be?");
        int max = userInput.nextInt();
        Guesser originalGuess = new Guesser(min, max);
        newGuess = originalGuess.returnGuess();
        System.out.println("Press enter when done");
        String doneOrNot = userInput.nextLine();


        originalGuess.printGuess();
        String wrongOrRight = userInput.nextLine();


        while (!wrongOrRight.equals("yes")) {
            if (wrongOrRight.equals("too low") || wrongOrRight.equals("too high")) {
                count++;
                if (wrongOrRight.equals("too low")) {
                    min = newGuess;
                }
                if (wrongOrRight.equals("too high")) {
                    max = newGuess;
                }
                newGuess = originalGuess.tooHighOrLow(wrongOrRight, min, max);
                originalGuess.printGuess();
                wrongOrRight = userInput.nextLine();
            } else {
                System.out.println("Enter \"yes\", \"too low\", or \"too high\"");
                wrongOrRight = userInput.nextLine();
            }
        }

        String congrats = "That took " + count + " tries";
        if (count < 10) {
            congrats += ". Wow! I did better than I though I would.";
        } else {
            count--;
            congrats += ". I kinda suck at this ngl. Next time I'll try to get it down to " + count + ".";
        }
        System.out.println(congrats);
    }
}
