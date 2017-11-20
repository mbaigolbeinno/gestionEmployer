/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projett;

/**
 *
 * @author INNOCENTY
 */
public abstract class Employe {
	 String nom,prenom;
	 int age;
	String date;
     
	
	
	public Employe(String prenom, String nom, int age, String date) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.date = date;
	}

	public abstract double calculerSalaire();

	public String getTitre()
		{
			return "L'employÃ© " ;
		}
	
	public String getNom() {
		return getTitre() + prenom + " " + nom;
	}
}
