import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int Balance=0;
        int Deposit, withdraw;
        HashMap<String, Integer> tranjactions=new HashMap<>();

        while (true){

            System.out.println("Welcome to ATM Machine\n");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for See Tranjections");
            System.out.println("Choose 5 for EXIT\n");
            System.out.print("Choose the operation:");

            int choice=sc.nextInt();

            switch(choice){

                case 1:
                    System.out.println("Enter Money to withdraw: ");
                    withdraw= sc.nextInt();
                    if(Balance >= withdraw){
                        Balance=Balance-withdraw;
                        tranjactions.put("Withdraw :", withdraw);
                        System.out.println("Please Collect Your Money..!");
                    }
                    else{
                        System.out.println("Insufficient Balance..!");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Enter Money to deposit..!");
                    Deposit= sc.nextInt();
                    if(Deposit<0){
                        System.out.println("Enter Valid Amount..!");
                    }
                    else{
                        Balance+=Deposit;
                        tranjactions.put("deposit :", Deposit);
                        System.out.println("Your Money has been successfully depsited");
                    }
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Account Balance: "+Balance);
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Transaction History: ");
                    for (Map.Entry<String, Integer> entry : tranjactions.entrySet()) {
                        String transactionType = entry.getKey();
                        int transactionAmount = entry.getValue();
                        System.out.println(transactionType + " " + transactionAmount);
                    }
                    System.out.println("");
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}