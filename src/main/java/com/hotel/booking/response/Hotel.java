package com.hotel.booking.response;


public class Hotel {
    private int id;
    private String nom;
    private String ville;
    private String pays;
    private String adresse;
    private int nbreEtoile;
    

    public Hotel(int id, String nom, String ville, String pays, String adresse, int nbreEtoile) {
        this.id = id;
        this.nom = nom;
        this.ville = ville;
        this.pays = pays;
        this.adresse = adresse;
        this.nbreEtoile = nbreEtoile;
        
    }


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public int getNbreEtoile() {
		return nbreEtoile;
	}


	public void setNbreEtoile(int nbreEtoile) {
		this.nbreEtoile = nbreEtoile;
	}

   
}
