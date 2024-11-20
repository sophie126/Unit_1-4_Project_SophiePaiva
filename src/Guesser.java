//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Guesser {
    private int guess;


    public Guesser() {
        guess = (int) (Math.random() * 99) + 1;
    }


    public void printGuess() {
        System.out.print("Is " + guess + " your number?");
    }

}