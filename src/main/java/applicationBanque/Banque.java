package applicationBanque;

import java.util.ArrayList;

public class Banque {
	ArrayList<String> numeroClient;
	ArrayList<String> numeroCompte;
	
	public Banque(ArrayList<String> numeroClient, ArrayList<String> numeroCompte)
	{
		this.numeroClient = numeroClient;
		this.numeroCompte = numeroCompte;
	}
	
	void retrait(String num_compte, String num_client, double montant)
	{
		
	}
	
	void depot(String num_compte, String num_client, double montant)
	{
		
	}
	
	void ouverture_compte(String numclient)
	{
		
	}
	
	void consultation(String num_compte)
	{
		
	}
	
	double conversionFromEuro(double montant)
	{
		return montant;
	}
	
	double conversionToEuro(double montant)
	{
		return montant;
	}

}
