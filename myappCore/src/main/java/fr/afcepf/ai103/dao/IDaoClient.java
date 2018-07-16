package fr.afcepf.ai103.dao;

import java.util.List;

import fr.afcepf.ai103.data.Client;

/*
 * DAO = Data Access Object 
 * avec méthodes CRUD : Create , Retreive , Update , Delete
 * avec throws RuntimeException (ou sous classe JpaException) implicites
 */
public interface IDaoClient {
	public Client insererNouveauClient(Client p);
	
	public Client rechercherClientParNumero(Long numero);
    public List<Client> rechercherClients();
    //... autres recherches ...
    
    public void mettreAjourClient(Client p);
    public void supprimerClient(Long numero);
}
