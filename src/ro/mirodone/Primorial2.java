package ro.mirodone;

public class Primorial2 {

    public String numPrimorial(int n) {


        long primorial = 1, factor = 1;

        while (n != 0) {
            factor++;
            boolean isPrime = true;
            for (int i = 2; i < factor; i++) {
                if (factor % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                n--;
                primorial *= factor;
            }
        }

        return primorial + "";

    }
}
