package td1;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		Banque b=new Banque("bna");
		
		Titulaire t=new Titulaire("rzouga");
		Titulaire t2=new Titulaire("ali");
		b.creerCompte(t,10);
		b.creerCompte(t, 30);
		b.creerCompte(t2,20);
//		b.afficherCopmtes();
//		
		t.depotTUT(30,50);
		t.depotTUT(10,10);
		
		t2.depotTUT(20,10);
		t2.afficheTit();
//		t.afficheTit();
//		
//		t.retraitTUT(10, 90);
//		t.afficheTit();
//		
		double x=t.maxSolde();
		System.out.println("le max est "+x);
		b.trierComptes();
		b.afficherCopmtes();
		
		System.out.println("***************************");
		ArrayList<Compte> ct = new ArrayList<>(t.MesComptes);
		SoldeComparator s = new SoldeComparator();
        Collections.sort(ct, s);
        for (Compte c : ct) {
            System.out.println(c);
        }
		 
	}

}
