package applicationBanque;

public class CompteAvecDecouvert extends Compte{
	private double decouvertAutorise;
	
	public CompteAvecDecouvert(String numeroCompte, double solde, double decouvertAutorise) 
	{
        super(numeroCompte, solde);
        this.decouvertAutorise = decouvertAutorise;
    }
	
	void debiter(double montant)
	{
		
	}

}
