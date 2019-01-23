package dice;

public class DiceMain {

  public static void main(String[] args) {
    Dice myDice = new Dice();

    myDice.roll();
    myDice.getCurrent();
    myDice.reroll();

    System.out.println("First 6 roll: " + myDice.toString());

    int countRound = 0;

    for (int i = 0; i < myDice.dices.length; i++) {
      while (myDice.getCurrent(i) != 6) {
        myDice.reroll(i);
        System.out.println("Check values in each round: " + myDice.toString());
        countRound++;
      }
    }
    System.out.println("Check if all values are 6: " + myDice.toString());
    System.out.println("Reroll nr: " + countRound);
  }
}
