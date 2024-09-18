package no.hvl.dat100;

import java.util.Scanner;
import java.lang.System;

public class O2 {

	public static void main(String[]args ) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("hvor mye tjente du i fjor?");
		System.out.print("> ");
		int inntekt = scanner.nextInt();
		
		double skatt1 = ((292850 - 208050)*0.017); // Trinn 1 skatt for inntekt over 292 850 kroner
		double skatt2 = ((670000 - 292851)*0.04); // Trinn 2 skatt for inntekt over 670 000 kroner
		double skatt3 = ((937900 - 670001)*0.136); // Trinn 3 skatt for inntekt over 937 900 kroner
		double skatt4 = ((1350000 - 937901)*0.166); //Trinn 4 skatt for inntekt over 1 350 000 kroner
		
		if (inntekt < 208050 && inntekt > 0) {
			System.out.println("Du skal ikke betale noe i trinnskatt");
		} else if (inntekt >= 208050 && inntekt <= 292850) {
			int a = (inntekt-208051);
			double trinnskattA = (a*0.017);
			System.out.println("Du må betale " + trinnskattA + " i trinnskatt");
		} else if (292851 <= inntekt && inntekt <= 670000) {
			int b = (inntekt - 292851);
			double trinnskattB = ((b*0.04) + skatt1);
			System.out.println("Du må betale " + trinnskattB + " i trinnskatt.");
			
		} else if (670001 <= inntekt && inntekt <= 937900) {
			int c = (inntekt - 670001);
			double trinnskattC = ((c*0.136) + skatt1 + skatt2);
			System.out.println("Du må betale " + trinnskattC + " i trinnskatt.");
		
		} else if (937901 <= inntekt && inntekt <= 1350000) {
			int d = (inntekt - 937901);
			double trinnskattD = ((d*0.166) + skatt1 + skatt2 + skatt3);
			System.out.println("Du må betale " + trinnskattD + " i trinnskatt.");
		} else if (1350001 <= inntekt) {
			int e = (inntekt - 1350001);
			double trinnskattE = ((e*0.176) + skatt1 + skatt2 + skatt3 + skatt4);
			System.out.println("Du må betale " + trinnskattE + " i trinnskatt.");
		} else {
			System.out.println("Ugyldig verdi. Skriv et positivt tall.");
		}
		

		scanner.close();
		
		
		
		
		
	}
}