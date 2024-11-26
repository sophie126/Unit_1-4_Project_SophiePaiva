//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Guesser {
private int guess;
private int count = 1;

public Guesser(int min, int max) {
    guess = (int) (Math.random() * (max - min + 1) + min);
}

public int returnGuess() {
    return guess;
}

public void increaseCount () {
    count++;
}


public int tooHighOrLow(int min, int max) {
    guess = (int) (Math.random() * (max - min + 1) + min);
    return guess;
}


public String toString() {
    return "Is " + guess + " your number? Enter \"yes\", \"too low\", or \"too high\"";
}

public int returnCount(){
    return count;
}

}