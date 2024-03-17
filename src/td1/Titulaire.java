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
			c.toString();
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
	public double maxSolde()
	{
		Compte cmax = null;
		double x = 0;
		for(Compte c:MesComptes)
		{
			if(this.compareTo(cmax,c)==-1)
			{
				cmax=c;
				x=cmax.solde;
			}
		}
		return x;
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
