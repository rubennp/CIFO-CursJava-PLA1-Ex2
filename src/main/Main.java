package main;

import java.util.Scanner;

public class Main {
	/*
	 * Demana altura i edat nen.
	 * Si nen és > 16 anys i > 140cm deixa accedir atracció PORTAVENTURA
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("ACCÉS AL DRAGON KHAN");
		System.out.println("--------------------");
		System.out.println("Introdueix l'edat:");
		int edat = in.nextInt();
		System.out.println("Introdueix l'altura (en cm):");
		int altura = in.nextInt();
		in.close();
		
		String out = "";
		
		System.out.println("--------------------");
		
		if (edat >= 16 && altura >= 140) {
			out = "OK, pots accedir.";
		} else {
			out = "Ho sentim";
			if (edat < 16 && altura < 140) {
				out += " no tens suficient edat ni altura";
			} else if (edat < 16 && altura >= 140) {
				out += " no tens suficient edat";
			} else if (edat >= 16 && altura < 140) {
				out += " no tens suficient altura";
			}
			out += " per accedir";
		}
		
		System.out.println(out);
	}

}
