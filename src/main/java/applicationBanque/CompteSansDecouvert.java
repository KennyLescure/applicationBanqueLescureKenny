package applicationBanque;

public class CompteSansDecouvert extends Compte{
	
	public CompteSansDecouvert(int numeroCompte, double solde) 
	{
        super(numeroCompte, solde);
    }
	
	
	public void debiter(double montant)
	{
		if(this.solde-montant>=0)
		{
			this.solde = this.solde - montant;
		}
	}

}
