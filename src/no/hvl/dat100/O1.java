package no.hvl.dat100;

import java.util.Scanner;

public class O1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	for (int i=1; i<=10; i++) {
		int poeng;
		
		while (true) {
            System.out.print("Skriv inn poengsummen til student " + i + " fra 0 til 100: ");
            poeng = scanner.nextInt();
            
            if (poeng >= 0 && poeng <= 100) {
                break; 
            } else {
                System.out.println("Ikke gyldig poengsum, vennligst prøv igjen.");
            }
        } 
		
      		char kar;
      		
      		if (poeng<=39) {
      			kar = 'F';
      		} else if (poeng<=49) {
      			kar = 'E';
      		} else if (poeng<=59) {
      			kar = 'D';
      		} else if (poeng<=79) {
      			kar = 'C';
      		} else if (poeng<=89) {
      			kar = 'B';
      		} else {
      			kar = 'A';
      		}
      			
      		System.out.println("Karakteren til student " + i + " er " + kar);
      			
    }
      	scanner.close();
    
	}}

      		