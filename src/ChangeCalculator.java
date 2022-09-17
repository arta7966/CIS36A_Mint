/*

Arthur Tan
CIS36A
ChangeCalculator Assignment
9-2-22
Revised 9-4-22

 */

import java.util.Scanner;

public class ChangeCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the amount due: ");
        double amountDue = keyboard.nextDouble();
        System.out.print("Enter the amount received: ");
        double amountReceived = keyboard.nextDouble();

        int amountDuePennies = (int) (Math.round(amountDue * 100));
        int amountReceivedPennies = (int) (Math.round(amountReceived * 100));
        int amountChangePennies = amountReceivedPennies - amountDuePennies;
        change(amountChangePennies);
    }

    static void change(int amountChangePennies){
        int dollars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickles = 0;
        int pennies = 0;

        if (amountChangePennies < 0) {
            System.out.println("Insufficient funds!");
        } else {
            dollars = amountChangePennies / 100;
            quarters = (amountChangePennies % 100)/25;
            dimes = ((amountChangePennies % 100)%25)/10;
            nickles = (((amountChangePennies % 100)%25)%10)/5;
            pennies = (((amountChangePennies % 100)%25)%10)%5;
            System.out.println(dollars + " Dollar(s), " + quarters + " Quarter(s), " + dimes + " Dime(s), " + nickles + " Nickle(s), " + pennies + " Pennie(s)");
        }

    }

}
