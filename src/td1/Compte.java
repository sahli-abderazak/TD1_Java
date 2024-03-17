package td1;

class Compte {
	int numero;
	double solde;

	 Compte(int num) {
	        numero = num;
	        solde = 0;
	    }
	void retrait(double m) {
		solde = solde - m;
	}

	void depot(double m) {
		solde = solde + m;
	}

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + "]";
	}

}
