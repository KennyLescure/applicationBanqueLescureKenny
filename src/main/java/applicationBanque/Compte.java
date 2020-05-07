package applicationBanque;

public abstract class Compte {
	
	int numeroCompte;
	double solde;
	
	public Compte(int numeroCompte, double solde)
	{
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}
	
	public Compte()
	{
		
	}
	
	public abstract void debiter(double montant);
	
	
	void crediter(double montant)
	{
		this.solde = this.solde + montant;
	}

}
