package applicationBanque;

public abstract class Compte {
	
	String numeroCompte;
	double solde;
	
	public Compte(String numeroCompte, double solde)
	{
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}
	
	public Compte()
	{
		
	}
	
	void debiter(double montant)
	{
		
	}
	
	void crediter(double montant)
	{
		
	}

}
