import java.io.*;
import java.util.*;
import java.text.*;

public class OptionMenu extends Account {
    Scanner MenuInput = new Scanner (System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'R'###,##0.00");

    HashMap<Integer, Integer> data = new HashMap <Integer, Integer>();

    /* Validate Login information customer number and pin */

    public void getLogin() throws IOEXCEPTION  {
        int x = 1;

        do {
            try{
                data.put(98765432, 1012);
                data.put(98989898, 1110);
                data.put(89898989, 1212);

                System.out.println("Welcome to the Money Machine Project!");

                System.out.println("Enter your customer number: ");
                setCustomerNumber(MenuInput.nextInt());

                System.out.println("Enter your Pin Number: ");
                setPinNum(MenuInput.nextInt());
            } catch (Exception e) {
                System.out.println("\n " + "Invalid character (s). only numbers." + "\n");

                x = 2;
            }
            for (Map.Entry<Integer, Integer> entry: data.entrySet()){
                if(entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber());

                getAccountType();
            }


            System.out.println("\n " + "Wrong Customer Number or Pin Number." + "\n");
        }while (x == 1);
    } /* Display Account Type Menu with Selection */

    private void setPinNum(int nextInt) {
    }

    private Object getPinNumber() {
        return null;
    }

    public void getAccountType(){
        System.out.println("Select the Account you want to access: ");
        System.out.println("Type 1 - Checking account: ");
        System.out.println("Type 2 - Savings account: ");
        System.out.println("Exit");

        Selection = MenuInput.nextInt();

        switch(Selection){
            case 1:
                getChecking();
                break;

            case 2:
                getSavings();
                break;

            case 3: System.out.println("Thank you for using this Money Machine System, bye");
                break;

            default: System.out.println("\n" + "Invalid Choice! " + "\n" );
                getAccountType();
        }
    }

    /* Display Checking Account Menu with Selection */
    public void getChecking() {
        System.out.println("Checking Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Deposit funds");
        System.out.println("Type 3 - Withdraw funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        Selection = MenuInput.nextInt();

        switch(Selection){
            case 1:
                System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;

            case 2:
                getCheckingDepositInput();
                getAccountType();
                break;

            case 3:
                getCheckingWithdrawInput();
                getAccountType();
                break;

            case 4: System.out.println("Thank you for using this Money Machine System, bye!" );
                break;

            default: System.out.println("\n" + "Invalid Choice! " + "\n" );
                getAccountType();
        }
    }

    /*Display savings account menu with selections */

    public void getSavings() {

        System.out.println("Savings Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Deposit funds");
        System.out.println("Type 3 - Withdraw funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        Selection = MenuInput.nextInt();

        switch(Selection){
            case 1:
                System.out.println("Savings Account Balance: " + moneyFormat.format(getSavingsBalance()));
                getAccountType();
                break;

            case 2:
                getSavingsDepositInput();
                getAccountType();
                break;

            case 3:
                getSavingsWithdrawInput();
                getAccountType();
                break;

            case 4: System.out.println("Thank you for using this Money Machine System, bye!" );
                break;

            default: System.out.println("\n" + "Invalid Choice! " + "\n" );
                getAccountType();
        }
    }
    int Selection;

    class IOEXCEPTION extends Exception {
    }

    private class entry<T, T1> {
        public T1 getKey() {
            return null;
        }

        public Object getValue() {
            return null;
        }
    }
}


