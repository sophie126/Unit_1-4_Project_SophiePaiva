//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Guesser {
private int guess;
private int newGuess;
private int count = 0;

public Guesser(int min, int max) {
    guess = (int) (Math.random() * (max - min + 1) + min);
}

public int returnGuess() {
    return guess;
}

public void increaseCount () {
    count++;
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
    count++;
    return newGuess;
}
//make sure there are no repeats


public String toString() {
    return "Is " + guess + " your number? Enter \"yes\", \"too low\", or \"too high\"";
}

public int returnCount(){
    return count;
}

}