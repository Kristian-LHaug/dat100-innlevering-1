package no.hvl.dat100;

import java.util.Scanner;

public class O3 {
		    
		  
		    public static long beregnFakultet(int n) {
		        long resultat = 1;

		        for (int i = 1; i <= n; i++) {
		            resultat = resultat * i;
		        }

		        return resultat;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Skriv inn et positivt tall: ");
		        int n = scanner.nextInt();
		        scanner.close();
		        
		        if (n <= 0) {
		            System.out.println("Feil: n må være større enn 0");
		        } else {
		            long fakultet = beregnFakultet(n);

		            System.out.println("Verdien av " + n + " faktultet er " + fakultet);
		        }
			    
	}

}
