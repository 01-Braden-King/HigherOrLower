package playyourcardsright;

import java.util.*;

public class PlayYourCardsRight {

    public static void main(String[] args) {
        System.out.println("The maximum number is 13");
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> numList = new ArrayList<>();
        int games = 0;
        int won = 0;
        int lost = 0;
        int amountNums = random.nextInt(12 - 6) + 6;
        for (int i = 0; i < amountNums; i++) {
            int randNum = random.nextInt(14);
            numList.add(randNum);

        }

        int arraySize = numList.size();
        for (int i = 1; i < arraySize; i++) {
            int playerNum = numList.get(i - 1);
            System.out.println("Your number is " + numList.get(i - 1) + " do you think the next number will be Higher or Lower");
            String userGuess = input.next();

            if (userGuess.equalsIgnoreCase("Draw") && playerNum == numList.get(i)) {
                System.out.println("It was a draw you guessed right");
                games++;
                won++;
            } else if (userGuess.equalsIgnoreCase("Lower") && playerNum > numList.get(i)) {
                System.out.println("It was lower you guessed right");
                games++;
                won++;
            } else if (userGuess.equalsIgnoreCase("Higher") && playerNum < numList.get(i)) {
                System.out.println("It was higher you guessed right");
                games++;
                won++;
            } else {
                System.out.println("You guessed wrong");
                lost++;
                games++;

            }

        }
        int winpercent = (won / games) * 100;
        System.out.println("You played a total of " + games + " games.");
        System.out.println("You won a total of " + won + " games.");
        System.out.println("You lost a total of " + lost + " games.");
        System.out.println("Therefore your overall win percentage is " + winpercent + " %");
    }

}
