
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import architecture.Controleur;
import architecture.Fenetre;
import donnee.CocktailDAO;
import donnee.NouvelleDAO;
import donnee.StationSpatialeDAO;
import modele.Cocktail;
import modele.Nouvelle;
import vue.VueAmis;
import vue.VueCommentaires;
import vue.VueMessages;
import vue.VueMirador;
import vue.VueMonnaies;
import vue.VueNouvelles;
import vue.VueNouvellesEspace;

public class App {

	public static void main(String[] parametres) {
		//Controleur.choisirVuePrincipale(VueMirador.class);
		//Controleur.choisirVuePrincipale(VueNouvelles.class);
		//choisirVuePrincipale(VueNouvellesEspace.class);
		//Controleur.choisirVuePrincipale(VueMonnaies.class);
		//Controleur.choisirVuePrincipale(VueCommentaires.class);
		//Controleur.choisirVuePrincipale(VueMessages.class);
		//Controleur.choisirVuePrincipale(VueAmis.class);
		
		/*
		NouvelleDAO nouvelleDAO = new NouvelleDAO();
		List<Nouvelle> nouvelles = nouvelleDAO.listerNouvelles();
		for(Nouvelle nouvelle : nouvelles)
		{
			System.out.println("TITRE : " + nouvelle.getTitre());
		}*/
		
		//StationSpatialeDAO stationDAO = new StationSpatialeDAO();
		//stationDAO.detaillerPosition();
		
		CocktailDAO cocktailDAO = new CocktailDAO();
		List<Cocktail> cocktails = cocktailDAO.listerCocktails();
		for(Cocktail cocktail:cocktails)
		{
			System.out.println(cocktail.getNom());
		}
		
		
		//Fenetre.launch(Fenetre.class, parametres);	
	}

}
