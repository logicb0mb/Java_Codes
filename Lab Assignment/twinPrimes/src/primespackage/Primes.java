package primespackage;

public class Primes {
    public static boolean checkForPrime(int n){
        {
            boolean isItPrime = true;

            if(n <= 1)
            {
                isItPrime = false;

                return isItPrime;
            }
            else
            {
                for (int i = 2; i<= n/2; i++)
                {
                    if ((n % i) == 0)
                    {
                        isItPrime = false;

                        break;
                    }
                }

                return isItPrime;
            }
        }
    }

}
