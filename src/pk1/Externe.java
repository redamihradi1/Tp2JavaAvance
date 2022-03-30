package pk1;

import pk1.Externe.Interne;

public class Externe {
	private int k=5;
	private static int compteur=0;
	private Interne interne = new Interne();
	
	public static class Interne{
		public void afficher() {
			 // System.out.println(k);	*******  erreur de compilation //
			System.out.println(compteur);
		}
		
	}

	public static void main(String[] args) {
		Externe.Interne interne= new Interne();

	}

}
