package primespackage;

import java.util.Scanner;

interface creditCardApp {
    void getPersonalDetails(String name, double mobNumber, String address, String nominee, double age, String email);
    double calculatePerYearIncome(double grossSalary);
    void printEligibility(double emiPerMonth);
}

class ICICI implements creditCardApp{

    String name;
    double mobNumber;
    String address;
    String nominee;
    double age;
    String email;
    double grossSalary;
    public void getPersonalDetails(String name, double mobNumber, String address, String nominee, double age, String email){
        this.name = name;
        this.mobNumber = mobNumber;
        this.address = address;
        this.nominee = nominee;
        this.age = age;
        this.email = email;
    }



    public double calculatePerYearIncome( double grossSalary) {
        this.grossSalary = grossSalary;
        double netSalaryPerMonth = grossSalary - (grossSalary*0.2);
        double perYearIncome = netSalaryPerMonth * 12;
        return perYearIncome;
    }


    public void printEligibility(double emiPerMonth) {
        double eligibilityScore;
        if(emiPerMonth==0){
            System.out.println("Eligibility Score: 3");

        } else if (emiPerMonth < ( 0.2 * calculatePerYearIncome(this.grossSalary))){
            System.out.println("Eligibility Score: 2");

        } else if (emiPerMonth < ( 0.4 * calculatePerYearIncome(this.grossSalary))){
            System.out.println("Eligibility Score: 1");

        } else if (emiPerMonth < ( 0.6 * calculatePerYearIncome(this.grossSalary))){
            System.out.println("Eligibility Score: 0");

        }

    }
}

class HDFC implements creditCardApp{
    String name;
    double mobNumber;
    String address;
    String nominee;
    double age;
    String email;
    double grossSalary;
    public void getPersonalDetails(String name, double mobNumber, String address, String nominee, double age, String email){
        this.name = name;
        this.mobNumber = mobNumber;
        this.address = address;
        this.nominee = nominee;
        this.age = age;
        this.email = email;
    }



    public double calculatePerYearIncome( double grossSalary) {
        this.grossSalary = grossSalary;
        double netSalaryPerMonth = grossSalary - (grossSalary*0.2);
        double perYearIncome = netSalaryPerMonth * 12;
        return perYearIncome;
    }


    public void printEligibility(double emiPerMonth) {
        double eligibilityScore;
        if(emiPerMonth==0){
            System.out.println("Eligibility Score: 3");

        } else if (emiPerMonth < ( 0.2 * calculatePerYearIncome(this.grossSalary))){
            System.out.println("Eligibility Score: 2");

        } else if (emiPerMonth < ( 0.4 * calculatePerYearIncome(this.grossSalary))){
            System.out.println("Eligibility Score: 1");

        } else if (emiPerMonth < ( 0.6 * calculatePerYearIncome(this.grossSalary))){
            System.out.println("Eligibility Score: 0");

        }

    }
}

class AXIS implements creditCardApp{
    String name;
    double mobNumber;
    String address;
    String nominee;
    double age;
    String email;
    double grossSalary;
    public void getPersonalDetails(String name, double mobNumber, String address, String nominee, double age, String email){
        this.name = name;
        this.mobNumber = mobNumber;
        this.address = address;
        this.nominee = nominee;
        this.age = age;
        this.email = email;
    }



    public double calculatePerYearIncome( double grossSalary) {
        this.grossSalary = grossSalary;
        double netSalaryPerMonth = grossSalary - (grossSalary*0.2);
        double perYearIncome = netSalaryPerMonth * 12;
        return perYearIncome;
    }


    public void printEligibility(double emiPerMonth) {
        double eligibilityScore;
        if(emiPerMonth==0){
            System.out.println("Eligibility Score: 3");

        } else if (emiPerMonth < ( 0.2 * calculatePerYearIncome(this.grossSalary))){
            System.out.println("Eligibility Score: 2");

        } else if (emiPerMonth < ( 0.4 * calculatePerYearIncome(this.grossSalary))){
            System.out.println("Eligibility Score: 1");

        } else if (emiPerMonth < ( 0.6 * calculatePerYearIncome(this.grossSalary))){
            System.out.println("Eligibility Score: 0");

        }

    }
}

public class Main {

    public static void main(String[] args) {
	// credit card app
        ICICI icici = new ICICI();
        HDFC hdfc = new HDFC();
        AXIS axis = new AXIS();

        String name;
        double mobNumber;
        String address;
        String nominee;
        double age;
        String email;
        double grossSalary;
        System.out.println("---------ICICI-----------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the user details of customer!");
        System.out.println("Enter the name");
            name = sc.nextLine();
        System.out.println("Enter the mobile Number");
            mobNumber = sc.nextDouble();
        System.out.println("Enter the address");
            address = sc.next();
        System.out.println("Enter the nominee");
            nominee = sc.next();
        System.out.println("Enter the age");
            age = sc.nextDouble();
        System.out.println("Enter the email");
            email =sc.next();

            System.out.println("Enter the gross salary");
            grossSalary = sc.nextDouble();

            icici.getPersonalDetails(name,mobNumber,address,nominee,age,email);
            double perYearIncome =  icici.calculatePerYearIncome(grossSalary);
            System.out.println("Per Year Income: "+ perYearIncome);
            System.out.println("Enter the emi payed by customer per month:");
            double emiPerMonth = sc.nextDouble();
            icici.printEligibility(emiPerMonth);

        System.out.println("----------HDFC----------");

        System.out.println("Please enter the user details of customer!");
        System.out.println("Enter the name");
        name = sc.next();
        System.out.println("Enter the mobile Number");
        mobNumber = sc.nextDouble();
        System.out.println("Enter the address");
        address = sc.next();
        System.out.println("Enter the nominee");
        nominee = sc.next();
        System.out.println("Enter the age");
        age = sc.nextDouble();
        System.out.println("Enter the email");
        email =sc.next();

        System.out.println("Enter the gross salary");
        grossSalary = sc.nextDouble();

        hdfc.getPersonalDetails(name,mobNumber,address,nominee,age,email);
        perYearIncome =  hdfc.calculatePerYearIncome(grossSalary);
        System.out.println("Per Year Income: "+ perYearIncome);
        System.out.println("Enter the emi payed by customer per month:");
        emiPerMonth = sc.nextDouble();
        hdfc.printEligibility(emiPerMonth);


        System.out.println("---------AXIS-----------");

        System.out.println("Please enter the user details of customer!");
        System.out.println("Enter the name");
        name = sc.next();
        System.out.println("Enter the mobile Number");
        mobNumber = sc.nextDouble();
        System.out.println("Enter the address");
        address = sc.next();
        System.out.println("Enter the nominee");
        nominee = sc.next();
        System.out.println("Enter the age");
        age = sc.nextDouble();
        System.out.println("Enter the email");
        email =sc.next();

        System.out.println("Enter the gross salary");
        grossSalary = sc.nextDouble();

        axis.getPersonalDetails(name,mobNumber,address,nominee,age,email);
        perYearIncome =  axis.calculatePerYearIncome(grossSalary);
        System.out.println("Per Year Income: "+ perYearIncome);
        System.out.println("Enter the emi payed by customer per month:");
        emiPerMonth = sc.nextDouble();
        axis.printEligibility(emiPerMonth);



    }
}
