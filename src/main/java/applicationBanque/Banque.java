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
	
	//de euro a dollars US
	double conversionFromEuro(double montant)
	{
		return montant*1.08;
	}
	
	//de dollars US a euro
	double conversionToEuro(double montant)
	{
		return montant*0.93;
	}

}
