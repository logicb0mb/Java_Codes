import primespackage.Primes;

import java.util.Scanner;

public class TwinPrimes {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lowerbound: ");
        a = sc.nextInt();
        System.out.println("Enter the upperbound: ");
        b = sc.nextInt();
        System.out.println("Twin Primes are:");
        for(int i = a;i<b;i++){
            for(int j=i;j<b;j++){
                boolean ci = Primes.checkForPrime(i);
                boolean cj = Primes.checkForPrime(j);
                if(ci && cj && (i != j)){
                    if(i-j == 2 || j-i ==2){
                        System.out.println("("+i+", "+j+")");
                    }
                }
            }
        }



    }
}
