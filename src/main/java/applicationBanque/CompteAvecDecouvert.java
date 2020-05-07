package applicationBanque;

public class CompteAvecDecouvert extends Compte{
	private double decouvertAutorise;
	
	public CompteAvecDecouvert(int numeroCompte, double solde, double decouvertAutorise) 
	{
        super(numeroCompte, solde);
        this.decouvertAutorise = decouvertAutorise;
    }
	
	public void debiter(double montant)
	{
		if (this.solde-montant>=decouvertAutorise)
		{
			this.solde = this.solde - montant;
		}
	}

}
