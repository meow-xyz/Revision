package procedural;

import java.util.Scanner;

public class Devine {

	public static void main(String[] args) {
		
		// creer un nombre aleatoire entre 1 et 10
		int numberRandom = (int)((Math.random() * 10) + 1);
		
		// creer un scanner, et rentrer une chiffre
		Scanner scan = new Scanner(System.in);
		System.out.println("entrez un nombre");
		int numberUser = scan.nextInt();
		
		//tant que le nombre est faux, on en essaye un autre
		while (numberUser != numberRandom) {
			System.out.println("entrez de nouveau un nombre");
			numberUser = scan.nextInt();
		}
		
		System.out.println("vous avez gagne!");

	}

}
