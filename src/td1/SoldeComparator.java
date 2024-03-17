package td1;

import java.util.Comparator;

public class SoldeComparator implements Comparator<Compte>{


	@Override
	public int compare(Compte o1, Compte o2) {
		if(o1.solde>o2.solde)
			return 1;
		if(o1.solde<o2.solde)
			return -1;
		return 0;
	}

}
