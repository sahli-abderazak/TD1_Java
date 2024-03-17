package td1;

class Compte implements Comparable<Compte> {
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
    public int compareTo(Compte c) {
        if (this.solde < c.solde) {
            return -1;
        } else if (this.solde > c.solde) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Compte [numero=" + numero + ", solde=" + solde + "]";
    }
}

