package ro.mirodone;

import java.math.BigInteger;

public class PrimorialK {

    private   boolean isPrime(int n) {

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    private int[] primes(int n) {
        int[] prime = new int[n];

        prime[0] = 2;
        int index = 1;

        for (int i = 3; ; i += 2) {
            if (isPrime(i)) {
                prime[index++] = i;
            }
            if (index == n) {
                return prime;
            }
        }
    }

    public  String numPrimorial(int n) {

        BigInteger result = new BigInteger("1");

        int [] prime = primes(n);

        for (int aPrime : prime) {
            result = result.multiply(BigInteger.valueOf(aPrime));
        }

        return result.toString();

    }

}
