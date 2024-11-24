//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Guesser {
private int guess;
private int newGuess;




public Guesser(int min, int max) {
    guess = (int) (Math.random() * (max - min + 1) + min);
}

public int returnGuess() {
    return guess;
}


public int tooHighOrLow(String lowOrHigh, int min, int max) {
    newGuess = (int) (Math.random() * (max - min + 1) + min);
    if (newGuess == guess && lowOrHigh.equals("too low")) {
        newGuess++;
    }
    if (newGuess == guess && lowOrHigh.equals("too high")) {
        newGuess--;
    }
    guess = newGuess;
    return newGuess;
}
//make sure there are no repeats


public void printGuess() {
    System.out.print("Is " + guess + " your number? Enter \"yes\", \"too low\", or \"too high\"");
}


}