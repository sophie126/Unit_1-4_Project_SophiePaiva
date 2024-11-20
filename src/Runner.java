import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        String useBoolean = "Answer in true or false";
        Scanner userInput = new Scanner(System.in);
        System.out.println(useBoolean + "\n");
        System.out.println("Think of a number 1 - 100 \n");
        Guesser originalGuess = new Guesser();
        System.out.println("Press enter when done");
        String doneOrNot = userInput.nextLine();


        try {
            originalGuess.printGuess();
            boolean wrongOrRight = userInput.nextBoolean();
            if (wrongOrRight) {
                System.out.println("YAY");
            }
            if (!wrongOrRight) {
                System.out.println("ok");

            }
        }
        catch(Exception e) {
            System.out.println(useBoolean);
        }


    }
}
