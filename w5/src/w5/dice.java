package w5;

import java.util.Arrays;

public class dice {

	public static void main(String[] args) {
		
		int ANTAL_KAST = 10000;
		int ANTAL_UTFALL = 10;
		
		int[] resultat = new int[ANTAL_UTFALL];
		
		for(int i = 0; i < ANTAL_KAST; i++) {
			int random = (int) (Math.random()*ANTAL_UTFALL);
			resultat[random]++;
		}
		for (int i = 0; i < resultat.length; i++)
		System.out.println("Antal " + (i + 1) + ":or " + resultat[i]);
	}
}
