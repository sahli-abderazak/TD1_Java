package td1;

import java.util.HashSet;

class Titulaire implements Comparable<Compte>{
	String nom;
	HashSet <Compte> MesComptes;

	Titulaire(String n) {
		nom = n;
		MesComptes = new HashSet<>(10);
	}
	public void ajoutCompt(Compte c)
	{
		this.MesComptes.add(c);
	}
	
	public void afficheTit()
	{
		for(Compte c:MesComptes)
		{
			System.out.println(c.toString());
		}
	}
	public void retraitTUT(int num,double m)
	{
		for(Compte c:MesComptes)
		{
			if(c.numero==num)
			{
				c.retrait(m);
			}
		}
		
	}
	public void depotTUT(int num,double m)
	{
		for(Compte c:MesComptes)
		{
			if(c.numero==num)
			{
				c.depot(m);
			}
		}
		
	}
	public double maxSolde() {

	    Compte cmax = null;

	    for (Compte c : MesComptes) {
	        if (cmax == null || c.solde > cmax.solde) {
	            cmax = c;
	        }
	    }

	    if (cmax != null) {
	        System.out.println("Le solde maximum pour " + nom + " est " + cmax.solde + " sur le compte numéro " + cmax.numero);
	        return cmax.solde;
	    } else {
	        System.out.println("Erreur");
	        return 0;
	    }
	}

	
	public int compareTo(Compte o1,Compte o2) {
		if(o1.solde>o2.solde)
			return 1;
		if(o1.solde<o2.solde)
			return -1;
		return 0;
	}
	@Override
	public int compareTo(Compte o) {
		// TODO Auto-generated method stub
		return 0;
	}
		
	
}
