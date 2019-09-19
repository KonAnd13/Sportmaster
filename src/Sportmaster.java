/*
Created by Andrew Konshin
*/
public class Sportmaster {
    public static void main(String[] args) {
        int amountOfPastPurchase = 5000;
        int amountOfCurrentPurchase = 14000;
        int bonus;
        final int AmountForBonus = 1000; //The buyer receives bonuses for every 1000 rubles in the amount of the check.

        //Types of Bonus Cards
        final int STANDART_LEVEL = 15_000;
        final int BONUS_STANDART = 50;

        final int SILVER_LEVEL = 150_000;
        final int BONUS_SILVER = 70;

        final int GOLD_LEVEL = 150_000;
        final int BONUS_GOLD = 100;

        //The sum of all purchases
        int amountOfAllPurchase = amountOfPastPurchase + amountOfCurrentPurchase;

        if (amountOfAllPurchase <= STANDART_LEVEL) {
            bonus = amountOfCurrentPurchase / AmountForBonus * BONUS_STANDART;
            System.out.println(bonus);
        } else if (amountOfAllPurchase <= SILVER_LEVEL) {
            bonus = amountOfCurrentPurchase / AmountForBonus * BONUS_SILVER;
            System.out.println(bonus);
        } else if (amountOfAllPurchase > GOLD_LEVEL) {
            bonus = amountOfCurrentPurchase / AmountForBonus * BONUS_GOLD;
            System.out.println(bonus);
        }
    }
}
