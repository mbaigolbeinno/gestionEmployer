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
public abstract class Commercial extends Employe {
        double chiffreAffaire;

	public Commercial(String prenom, String nom, int age, String date,
			   double chiffreAffaire) {
		super(prenom, nom, age, date);
		this.chiffreAffaire = chiffreAffaire;
	}

	public double getChiffreAffaire()
		{
			return chiffreAffaire;
		}
	
}

