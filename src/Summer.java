import java.util.Scanner;
public class Summer {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double input = 1;
        double total = 0;

        while (input > 0) {
            System.out.print("Enter a number, or enter a 0 to exit and get your total. ");
            input = in.nextDouble();
            total = total + input;
        }
        System.out.print("Your total is " + total);


    }
}
