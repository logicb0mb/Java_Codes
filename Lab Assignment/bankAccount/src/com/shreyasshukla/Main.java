package com.shreyasshukla;


import java.util.Scanner;



class Account {
    String customerName;
    int accountNumber;
    String typeOfAccount;
    double balance;
    Account(String inpcusName, int inpaccNum, String inptoAcc, double balance){
        this.customerName = inpcusName;
        this.accountNumber = inpaccNum;
        this.typeOfAccount = inptoAcc;
        this.balance = balance;
    }
    void depositAmmount(double deposit){
        this.balance += deposit;
    }
    void displayBlance(){
        System.out.println("Balance Amount is: "+ this.balance);
    }
}

class Savings_account extends Account {
    int rate;
    int time;
    Savings_account( String inpcusName, int inpaccNum, String inptoAcc,double balance, int rate, int time){
        super(inpcusName,inpaccNum,inptoAcc, balance);
        this.rate = rate;
        this.time = time;
    }
    void interestCalculation(){
        double compoundInterest = (balance*(Math.pow(1+rate, time))) - balance;
        System.out.println("Compound Interest at"+ rate+"% for "+ time  +" is: "+ compoundInterest);
        balance += compoundInterest;
        this.displayBlance();
    }
    void withdrawal(double amountToBeWithdrawn){
        balance -= amountToBeWithdrawn;
        this.displayBlance();
    }
}

class Curr_account extends Account {
    double minimumbalance;
    Curr_account(String inpcusName, int inpaccNum, String inptoAcc, double balance, double minimumbalance){
        super(inpcusName,inpaccNum,inptoAcc, balance);
        this.minimumbalance = minimumbalance;
    }
    boolean checkMinimumBalance(double withAmt){
        if(balance < minimumbalance){
            System.out.println("Balance is less than minimum balance! Deducting Penalty");
            balance -= 50;
            this.displayBlance();
            return true;
        } else {
            System.out.println("Balance is greater than minimum balance can do withdrawl!");
            this.withdrawal(withAmt);
            return false;
        }
    }
    void withdrawal(double amountToBeWithdrawn){
        balance -= amountToBeWithdrawn;
        this.displayBlance();
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to Bank!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.nextLine();
        System.out.println("Enter the account Number");
        int accNo = sc.nextInt();
        String typeOfAccount;
        System.out.println("Choose the type of account: (savings or current)");
        typeOfAccount = sc.next();

        if(typeOfAccount.equals("savings")){
            System.out.println("Enter the initial balance:");
            double bal = sc.nextDouble();
            System.out.println("Enter the rate of interest:");
            int rate = sc.nextInt();
            System.out.println("Enter the time period:");
            int time = sc.nextInt();
            Savings_account sav = new Savings_account(name, accNo, typeOfAccount, bal, rate, time);
            System.out.println("Enter the amount to be deposited");
            double depositAmount = sc.nextDouble();
            sav.depositAmmount(depositAmount);
            sav.displayBlance();
            sav.interestCalculation();
            System.out.println("Enter the amount to be withdrawn:");
            double withdrawnAmount = sc.nextDouble();
            sav.withdrawal(withdrawnAmount);
        } else {
            System.out.println("Enter the initial balance:");
            double bal = sc.nextDouble();
            System.out.println("Enter the minimum Balance");
            double minbal = sc.nextDouble();
            Curr_account curr = new Curr_account(name,accNo,typeOfAccount,bal,minbal);
            System.out.println("Enter the amount to be deposited");
            double depositAmount = sc.nextDouble();
            curr.depositAmmount(depositAmount);
            curr.displayBlance();
            System.out.println("Enter the amount to be withdrawn:");
            double withdrawnAmount = sc.nextDouble();
            curr.checkMinimumBalance(withdrawnAmount);
        }
    }
}
