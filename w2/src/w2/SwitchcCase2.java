package w2;

import java.util.Scanner;

public class SwitchcCase2 {

	public static void main(String[] args) {
		
		boolean run=true;
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("[1] H�ngning");
		System.out.println("[2] Hoppa fr�n h�g h�jd");
		System.out.println("[3] Bli skjuten");
		System.out.println("[4] Cyanid");
		System.out.println("[5] Nicklas");
		System.out.println("[6] quit");
		
		int choice = input.nextInt();
		
		String genre;
		while(run) {
		switch (choice) {
		case 1:
			System.out.println("");
			System.out.println("D�");
			System.out.println("[1] Skolan");
			System.out.println("[2] Polisstationen");
			System.out.println("[3] P� landet");
			choice = input.nextint();
			System.out.println(choice + "�r ett bra val!");
			break;
		
		case 2:
			System.out.println();
			System.out.println();
			System.out.println();
			break;
			
		case 3:
			System.out.println();
			System.out.println();
			System.out.println();
			break;
			
		case 4:
			System.out.println();
			System.out.println();
			System.out.println();
			break;
			
		case 5:
			System.out.println();
			System.out.println();
			System.out.println();
			break;
			
		case 6:
			run=false;
			break;
			
			
		}
		}
	}
	
}