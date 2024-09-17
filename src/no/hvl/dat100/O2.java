package no.hvl.dat100;

import java.util.Scanner;

public class O2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("Skriv inn din bruttoinntekt:");
		
		double inntekt = scanner.nextDouble();
		
		
		double t1 = 0.012;
		double t2 = 0.4;
		double t3 = 0.136;
		double t4 = 0.166;
		double t5 = 0.176;
		
		if (inntekt <= 208050) {
			System.out.println("Ingen trinnskatt");
		}
		else if (inntekt <= 292850 ) {
			System.out.println("Bruttoinntekten din er " + inntekt + "kr, og trinnskatten din er " + (inntekt*t1)+ "kr");
			}
		else if (inntekt <= 670000 ) {
			System.out.println("Bruttoinntekten din er " + inntekt + "kr, og trinnskatten din er " + (inntekt*t2)+ "kr");
			}
		else if (inntekt <= 937900) {
			System.out.println("Bruttoinntekten din er " + inntekt + "kr, og trinnskatten din er " + (inntekt*t3)+ "kr");
			}
		else if (inntekt <= 1350000) {
			System.out.println("Bruttoinntekten din er " + inntekt + "kr, og trinnskatten din er " + (inntekt*t4)+ "kr");
			}
		else if (inntekt > 1350000) {
			System.out.println("Bruttoinntekten din er " + inntekt + "kr, og trinnskatten din er " + (inntekt*t5)+ "kr");
			}
		
		scanner.close();

	}

}
