package me.bindo.oefeningen;

import java.util.Scanner;

public class Kubussen {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int getal = 0;
		
		do {
			System.out.printf("Geef het aantal gewenste kubussen [1-20]: ");
			getal = scanner.nextInt();
		} while (getal > 20 || getal < 1);
		
		int totaalNodig = 1;
		String berekening = "We berekenen dit met de volgende som: 1";
		
		for(int i = 2; i<= getal; i++) {
			int aantal = (int) Math.pow(i, 3);
			totaalNodig += aantal;
			berekening += "+" + aantal;
		}
		
		berekening += "=" + totaalNodig;
		
		System.out.printf("Om %d kubussen van opeenvolgende groote te maken, %s %d %s nodig%n", getal, totaalNodig == 1 ? "is" : "zijn", totaalNodig, totaalNodig == 1 ? "blokje" : "blokjes");
		System.out.println(berekening);
		
	}
	
}
