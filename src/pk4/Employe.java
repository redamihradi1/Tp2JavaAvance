package pk4;

import java.util.Comparator;

public class Employe {

	private String nom;
	private int nbAnnee;
	private double salaireBase;
	
	public Employe(String nom, int nbAnnee, double salaireBase) {
		super();
		this.nom = nom;
		this.nbAnnee = nbAnnee;
		this.salaireBase = salaireBase;
	}
	
	public double calculSalaire() {
		return salaireBase*(1+(double)nbAnnee/10);
	}
	@Override
	public String toString() {
		return "Employe [nom= " + nom + ", nbAnnee= " + nbAnnee + ", salaire final= " + calculSalaire() + " dhs ]";
	}

	public static void main(String[] args) {
		Employe employe1 = new Employe("reda", 5, 15000);
		Employe employe2 = new Employe("driss",10,15000);
		Employe directeur = new Employe("Ahmed", 10, 20000) {
			@Override
			public double calculSalaire() {
				// TODO Auto-generated method stub
				return super.calculSalaire()+15000;
			}
		};

		System.out.println(employe1);
		System.out.println(employe2);
		System.out.println(directeur);
		// Declarer un comparateur des employes qui compare en fonction de leurs salaire
		Comparator<Employe> comparateurEmploye = new Comparator<Employe>() {
			
			@Override
			public int compare(Employe e1, Employe e2) {
				if(e1.calculSalaire() > e2.calculSalaire())
				return 1;
				if(e1.calculSalaire() < e2.calculSalaire())
				return -1;
				return 0 ;
			}
		};
		
		// recherche sur les expression lambda et les interface fonctionel 
		
	}

	

}
