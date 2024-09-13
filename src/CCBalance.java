import java.util.Scanner;

public class CCBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variable
        double INITIAL_BALANCE = 5000;
        double INTEREST_RATE = 0.17;
        double monthOneBalance = 0;
        double monthTwoBalance = 0;

        //process of calculating balance after one and then two months
        monthOneBalance = INITIAL_BALANCE * INTEREST_RATE;
        monthTwoBalance = monthOneBalance * INTEREST_RATE;

        //outputting the balance due after one month and then two months
        System.out.println("Your amount due after interest rate of 17% is $" + monthOneBalance + ".");
        System.out.println("You did not pay your last months amount. Your this months due is $" + monthTwoBalance + ".");
    }
}