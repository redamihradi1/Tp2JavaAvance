package pk1;

import pk1.Englobante.Interne;

public class Englobante {
	
	
	private int i =5;
	private Interne interne = new Interne();
	
		
	public void afficher() {
		System.out.println("i = "+this.i);
	}
	
	public class Interne{
		private int i = 6;	
		private static int k=5;
		public void afficher() {
			Englobante.this.afficher();
			System.out.println("i = "+this.i);
			
		}
	}
	
	public static void main(String[] args) {
		
		Englobante englobante = new Englobante();
		Englobante.Interne interne = englobante.new Interne();
		
		interne.afficher();
	}

}
