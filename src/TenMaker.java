
import java.util.Scanner;
public class TenMaker {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = in.nextInt();

        System.out.print("Enter another number: ");
        int b = in.nextInt();

        int summer = makes10(a, b);

        if (summer ==1) {
            System.out.print("The numbers add to 10!");
        }
        else {
            System.out.print("The numbers do not add to 10.");
        }}

    public static int makes10(int a, int b) {
        int sum = a + b;

        if (sum == 10) {
            return 1;
        }
        else {
            return 0;
        }
    }
}