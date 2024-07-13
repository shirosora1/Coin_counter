import java.util.Scanner;
import java.util.Arrays;

public class CoinCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double coins[] = {0.01, 0.02, 0.05, 0.10, 0.20, 0.50, 1, 2};

        /*

        double coin1 = 0.01;
        double coin2 = 0.02;
        double coin5 = 0.05;
        double coin10 = 0.10;
        double coin20 = 0.20;
        double coin50 = 0.50;
        double poundCoin = 1;
        double twoPoundCoin = 2;

         */

        int totalCoins[] = new int[8];

        System.out.print("How many 1p coins do you have? ");
        int onePence = scanner.nextInt();
        totalCoins[0] = onePence;

        System.out.println(" ");

        System.out.print("How many 2p coins do you have? ");
        int twoPence = scanner.nextInt();
        totalCoins[1] = twoPence;

        System.out.println(" ");

        System.out.print("How many 5p coins do you have? ");
        int fivePence = scanner.nextInt();
        totalCoins[2] = fivePence;

        System.out.println(" ");

        System.out.print("How many 10p coins do you have? ");
        int tenPence = scanner.nextInt();
        totalCoins[3] = tenPence;

        System.out.println(" ");

        System.out.print("How many 20p coins do you have? ");
        int twentyPence = scanner.nextInt();
        totalCoins[4] = twentyPence;

        System.out.println(" ");

        System.out.print("How many 50p coins do you have? ");
        int fiftyPence = scanner.nextInt();
        totalCoins[5] = fiftyPence;

        System.out.println(" ");

        System.out.print("How many £1 coins do you have? ");
        int onePound = scanner.nextInt();
        totalCoins[6] = onePound;

        System.out.println(" ");

        System.out.print("How many £2 coins do you have? ");
        int twoPound = scanner.nextInt();
        totalCoins[7] = twoPound;

        System.out.println(" ");

        double total = totalCoins[0] * coins[0] + totalCoins[1] * coins[1] + totalCoins[2] * coins[2] +
                totalCoins[3] * coins[3] + totalCoins[4] * coins[4] + totalCoins[5] * coins[5] +
                totalCoins[6] * coins[6] + totalCoins[7] * coins[7];

        System.out.printf("Your total amount of change is £%.2f", total);

        scanner.close();

    }

}