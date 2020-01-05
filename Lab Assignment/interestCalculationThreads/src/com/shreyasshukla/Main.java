import java.text.DecimalFormat;
import java.util.Scanner;

class Account extends Thread{
    private String accountNumber;
    private double balance;
    private String accountHolderNumber;
    public String getAccountNumber(){
        return accountNumber;

    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getAccountHolderNumber(){
        return accountHolderNumber;
    }

    public void setAccountHolderNumber(String accountHolderNumber) {
        this.accountHolderNumber = accountHolderNumber;
    }
    public void run(){
        double interest, amount;
        DecimalFormat d = new DecimalFormat("0.00");
        if(this.balance >= 10000){
            interest = balance * 0.08;
            amount = balance + interest;
        } else {
            interest = balance*0.05;
            amount = balance+interest;
        }
        System.out.println(d.format(interest)+" "+d.format(amount));
    }
}
class Main {
    public static void main(String [] args){
        int i,n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        for (i = 0; i<n; i++){
            Account a  = new Account();
            a.setAccountNumber(sc.nextLine());
            a.setBalance(Double.parseDouble(sc.nextLine()));
            a.setAccountHolderNumber(sc.nextLine());
            Thread t = new Thread(a);
            a.start();
        }
    }
}