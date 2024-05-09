//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 import java.util.Scanner;

public class Main{ public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt user for the amount to withdraw
            System.out.print("Enter the amount to withdraw: ");
            int amountToWithdraw = scanner.nextInt();

            Account account = new Account("John Doe", 500, "123456789");

            try
    {
                // Simulating transfer with amount greater than balance
                account.transfer(amountToWithdraw);
            } catch (NotEnoughMoneyException e) {
                System.out.println("Caught NotEnoughMoneyException: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Caught exception: " + e.getMessage());
            } finally {
                System.out.println("Current account balance: " + account.getBalance());
            }

            scanner.close();
    }

}