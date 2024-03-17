package td1;

import java.util.ArrayList;
import java.util.Iterator;

public class Banque {
	String nom;
	ArrayList<Compte> Comptes;

	Banque(String n) {
		Comptes = new ArrayList<>(50);
		nom = n;
	}

	public void creerCompte(Titulaire titulaire, int num) {
		Compte nv = new Compte(num);
		this.Comptes.add(nv);
		titulaire.ajoutCompt(nv);
	}
	public void afficherCopmtes()
	{
		Iterator<Compte> it= Comptes.iterator();
		while(it.hasNext())
		{
			Compte c=it.next();
			System.out.println(c.toString());
		}
	}
}

