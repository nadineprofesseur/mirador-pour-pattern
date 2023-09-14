package controleur;

import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import modele.Nouvelle;
import modele.StatistiquesMeteores;
import vue.VueMirador;

public class ControleurMirador extends Controleur{

	public ControleurMirador()
	{
		Logger.logMsg(Logger.INFO, "new ControleurMirador()");
	}
	
	public void initialiser()
	{
		VueMirador vue = VueMirador.getInstance(); // va chercher l'objet
		
		int nombreAstronautes = 7; // temporaire avant DAO
		VueMirador.getInstance().afficherNombreAstronautes(nombreAstronautes);
		
		// objet bidon
		StatistiquesMeteores statistiquesMeteores = new StatistiquesMeteores(20, 500, 4000);
		vue.afficherStatistiquesMeteores(statistiquesMeteores);
		
		// objets bidons
		Nouvelle nouvelle1 = new Nouvelle("Des solar flares en 2023", "Russell");
		Nouvelle nouvelle2 = new Nouvelle("Les indiens sur la lune", "Pete Scott");
		Nouvelle nouvelle3 = new Nouvelle("Les perseides en aout", "Julie Deschamps");

		List<Nouvelle> nouvelles = new ArrayList<Nouvelle>();
		nouvelles.add(nouvelle1);
		nouvelles.add(nouvelle2);
		nouvelles.add(nouvelle3);
		
		vue.afficherNouvelles(nouvelles);
		
		
	}
}
