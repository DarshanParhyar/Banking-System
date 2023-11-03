import java.util.Scanner;

public class SimpleBankingSystem {
    public static void main(String[] args) {
        System.out.println("Welcome To Simple Banking System");
        Scanner input = new Scanner(System.in);
        

        System.out.print("Enter your name to create an account: ");
        String name = input.nextLine();

        System.out.print("Enter your password: ");
        String password = input.nextLine(); 

        double balanceDep = 0;

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1 - Deposit the balance");
            System.out.println("2 - Withdraw the balance");
            System.out.println("3 - Check the balance");
            System.out.println("4 - Exit");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount you want to deposit: ");
                    double amountDep = input.nextDouble();
                    balanceDep += amountDep;
                    System.out.println("Amount deposited successfully!");
                    break;

                case 2:
                    System.out.print("Enter the amount you want to withdraw: ");
                    double amountWithdraw = input.nextDouble();
                    if (amountWithdraw > balanceDep) {
                        System.out.println("Insufficient Balance!");
                    } else {
                        balanceDep -= amountWithdraw;
                        System.out.println("Amount withdrawn successfully!");
                    }
                    break;

                case 3:
                    System.out.println("Your current balance is " + balanceDep);
                    break;

                case 4:
                    System.out.println("Exiting the system. Have a nice day!");
                    input.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        
    }
}
