package applicationBanque;

import java.util.ArrayList;

public class Client {
	ArrayList<Compte> compte;
	int numeroClient;
	String adresse;
	String nom;
	
	public Client(ArrayList<Compte> compte, int numeroClient, String adresse, String nom)
	{
		this.compte = compte;
		this.numeroClient = numeroClient;
		this.adresse = adresse;
		this.nom = nom;
	}
	
	public Client(int numeroClient, String adresse, String nom)
	{
		this.numeroClient = numeroClient;
		this.adresse = adresse;
		this.nom = nom;
	}
	
	public Client() {
		
	}

}
