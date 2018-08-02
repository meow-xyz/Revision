package Pendu;

import java.util.Scanner;
public class Pendu {
    
//Consigne au joueur + nombre de lettres dans le mot
    
    public static void consigne(int a) {
        System.out.println("Proposez un mot de " + a + " lettres en minuscules,");
        System.out.println("Vous avez 10 essais!");
    }
    
//Partie
    
    public static int essais = 10;
    public static int score = 500;
    
    public static void partie(String wordToFind) {
        while (essais > 0) {
            final Scanner uW = new Scanner(System.in);
            final String userWord = uW.next();
                if (userWord.equals(wordToFind)) {
                    System.out.println("Vous avez gagné!");
                    System.out.println("Score: " + score + ".");
                }
                else {
                    if (essais > 2) {
                        essais = essais-1;
                        score = score-10;
                        System.out.println("Vous avez " + essais + " essais restants!");
                    }
                    else if (essais > 1) {
                        essais = essais-1;
                        score = score-10;
                        System.out.println("Vous avez " + essais + " essai restant!");
                    }
                    else {
                        essais = essais-1;
                        System.out.println("Vous avez perdu!");
                    }
                }
        }
    }
    public static void main(String[] args) {
//Indiquer nombre de lettres
        consigne(7);
//Indiquer mot à trouver        
        partie("bisouss");
    }
  }