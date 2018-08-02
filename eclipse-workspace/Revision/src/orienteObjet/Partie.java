package orienteObjet;

public class Partie {

	//declaration de variable numberRandom de type int
	int numberRandom;

	// creation de Joueur appele tom
	Joueur tom = new Joueur();

	public void jouerPartie() {

		// initialiser numberRandom avec un nombre aleatoire entra 1 et 10
		numberRandom = (int)(Math.random() * 10 + 1);
		
		// on appele "entrerNombre" qui se trouve dans l'objet "tom"
		tom.entrerNombre();
		
		// tant que numberUser est different de numberRandom, on entre un nouveau nombre
		while (tom.getNumberUser() != numberRandom) {
			tom.entrerNombre();
		}
		System.out.println("vous avez gagne!");
	}

}
