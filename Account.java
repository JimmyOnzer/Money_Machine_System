import java.io.*;
import java.util.*;
import java.text.*;

public class Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'R'###,##0.00");

    /*Set the customer number*/
    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }

    /*Get the customer number*/
    public int getCustomerNumber(){
        return customerNumber;
    }

    /*Set the pin number*/
    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    /*Get the pin number*/
    public int getPinrNumber(){
        return pinNumber;
    }

    /*Get Checking Account Balance*/
    public double getCheckingBalance(){
        return checkingBalance;
    }

    /*Get Savings Account Balance*/
    public double getSavingsBalance(){
        return savingsBalance;
    }

    /* Calculate checking Account withdrawal */
    public double calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    /* Calculate savings Account withdrawal */
    public double calcSavingsWithdraw(double amount){
        savingsBalance = (savingsBalance - amount);
        return savingsBalance;
    }

    /* Calculate checking Account deposit */
    public double calcCheckingDeposit(double amount){
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    /* Calculate savings Account withdrawal */
    public double calcSavingsDeposit(double amount){
        savingsBalance = (savingsBalance - amount);
        return savingsBalance;
    }

    /* Customer Checking Account withdraw input */
    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance()));
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance - amount) >= 0){
            calcCheckingWithdraw(amount);

            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance()));
        }else{
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    /* Customer Savings Account withdraw input */
    public void getSavingsWithdrawInput(){
        System.out.println("Savings Account Balance: " + moneyFormat.format(savingsBalance()));
        System.out.println("Amount you want to withdraw from Savings Account: ");
        double amount = input.nextDouble();

        if((savingsBalance - amount) >= 0){
            calcSavingsWithdraw(amount);

            System.out.println("New Savings Account Balance: " + moneyFormat.format(savingsBalance()));
        }else{
            System.out.println("Balance cannot be negative." + "\n");
        }
    }

    private double savingsBalance() {
        return 0;
    }

    /* Customer Checking Account Deposit Input */
    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance()));

        System.out.println("Amount you want to deposit from checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance + amount) >= 0){
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance()));
        }else{
            System.out.println("Balance Cannot be negative." + "\n");
        }
    }

    private double checkingBalance() {
        return 0;
    }

    /* Customer Savings Account Deposit Input */
    public void getSavingsDepositInput(){
        System.out.println("Savings Account Balance: " + moneyFormat.format(savingsBalance()));

        System.out.println("Amount you want to deposit from savings Account: ");
        double amount = input.nextDouble();

        if((savingsBalance + amount) >= 0){
            calcSavingsDeposit(amount);
            System.out.println("New Savings Account Balance: " + moneyFormat.format(savingsBalance()));
        }else{
            System.out.println("Balance Cannot be negative." + "\n");
        }
    }

    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingsBalance = 0;
}
