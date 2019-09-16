/*
Created by Andrew Konshin
*/
public class Sportmaster {
    public static void main(String[] args) {
        int amountOfPastPurchase = 5000;
        int amountOfCurrentPurchase = 14000;
        int bonus;

        //Виды бонусных карт
        final int STANDART_LEVEL = 15_000;
        final int BONUS_STANDART = 50;

        final int SILVER_LEVEL = 150_000;
        final int BONUS_SILVER = 70;

        final int GOLD_LEVEL = 151_000;
        final int BONUS_GOLD = 100;

        //Сумма всех покупок
        int amountOfAllPurchase = amountOfPastPurchase + amountOfCurrentPurchase;

        if (amountOfAllPurchase <= STANDART_LEVEL) {
            bonus = amountOfCurrentPurchase / 1000 * BONUS_STANDART;
            System.out.println(bonus);
        } else if (amountOfAllPurchase <= SILVER_LEVEL) {
            bonus = amountOfCurrentPurchase / 1000 * BONUS_SILVER;
            System.out.println(bonus);
        } else if (amountOfAllPurchase > GOLD_LEVEL) {
            bonus = amountOfCurrentPurchase / 1000 * BONUS_GOLD;
            System.out.println(bonus);
        }
    }
}
