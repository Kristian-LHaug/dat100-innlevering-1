package no.hvl.dat100;

import java.util.Scanner;

public class O1 {
	
		    	
		    	 public static String beregnKarakter(int poengsum) {
				        if (poengsum < 0 || poengsum > 100) {
				            return "Ugyldig poengsum";
				        } else if (poengsum <= 39) {
				            return "F";
				        } else if (poengsum <= 49) {
				            return "E";
				        } else if (poengsum <= 59) {
				            return "D";
				        } else if (poengsum <= 79) {
				            return "C";
				        } else if (poengsum <= 89) {
				            return "B";
				        } else {
				            return "A";
				        }
				    }
		    	
		    		 
		    	

		    	 public static void main(String[] args) {
		    	        Scanner scanner = new Scanner(System.in);

		    	        int[] poengsumArray = new int[10];
		    	        String[] karakterArray = new String[10];

		    	        for (int i = 0; i < 10; i++) {
		    	            System.out.print("Skriv inn poengsum for elev " + (i + 1) + ": ");
		    	            poengsumArray[i] = scanner.nextInt();
		    	            karakterArray[i] = beregnKarakter(poengsumArray[i]);
		    	        }

		    	        System.out.println("\nKarakterene for hver poengsum er:");
		    	        for (int i = 0; i < 10; i++) {
		    	            System.out.println("Elev " + (i + 1) + " - Poengsum: " + poengsumArray[i] + ", Karakter: " + karakterArray[i]);
		    	        }

		    	        scanner.close();				    		 
				    	 }
				    		
		    }
		   
