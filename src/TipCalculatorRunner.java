import java.util.Scanner;
public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Welcome to the tip calculator!");
        System.out.print("How many people are in your group: ");
        int people = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        int tip = scan.nextInt();

        TipCalculator bill = new TipCalculator(people, tip);
        bill.addMeal(0.0);



    }
}
