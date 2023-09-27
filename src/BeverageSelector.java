import java.util.Scanner;
public class BeverageSelector {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What beverage would you like? Type 1 for water, 2 for coke, or 3 for coffee.");

        int beverage = in.nextInt();

        if (beverage == 1) {
            System.out.println("Enjoy your water!");
        }
        else if (beverage == 2) {
            System.out.println("Enjoy your coke!");
        }
        else if (beverage == 3) {
            System.out.print("Enjoy your coffee!");
        }
        else {
            System.out.println("You didn't enter a 1, 2, or 3, now you get nothing. :)");
        }
    }
}
