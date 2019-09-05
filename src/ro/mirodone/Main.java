package ro.mirodone;

public class Main {

    public static void main(String[] args) {

        Primorial primorial = new Primorial();

        Primorial2 primorial2 = new Primorial2();

        System.out.println(primorial2.numPrimorial(3));
        System.out.println(primorial2.numPrimorial(4));


        int n = 199;
        primorial.sieveSundaram();
        for (int i = 1; i <= n; i++) {
            System.out.println("Primorial(P#) of " + i + " is " + primorial.calculatePrimorial(i));
        }


    }
}
