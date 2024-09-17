package no.hvl.dat100;

import java.util.Scanner;

public class O3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Skriv inn et tall for å beregne fakultet:");
        
        long n = scanner.nextLong();
        
        if (n >= 0) {
            long fak = 1;
            
            for (long i = 1; i <= n; i++) {
                fak *= i;
            }
            
            System.out.println("Fakulteten av " + n + " er: " + fak);
        } else {
            System.out.println("Fakultet er ikke definert for negative tall. Skriv inn et positivt tall.");
        }
        
        scanner.close();
    }
}
