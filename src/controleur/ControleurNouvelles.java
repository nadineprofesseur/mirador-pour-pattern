package controleur;

import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import modele.Nouvelle;
import vue.VueNouvelles;

public class ControleurNouvelles extends Controleur {

	public ControleurNouvelles()
	{
		Logger.logMsg(Logger.INFO, "new ControleurNouvelles()");
	}
	public void initialiser()
	{
		VueNouvelles vue = VueNouvelles.getInstance();
		
		// objets bidons
		Nouvelle nouvelle1 = new Nouvelle("Des solar flares en 2023", "Russell");
		Nouvelle nouvelle2 = new Nouvelle("Les indiens sur la lune", "Pete Scott");
		Nouvelle nouvelle3 = new Nouvelle("Les perseides en aout", "Julie Deschamps");
		Nouvelle nouvelle4 = new Nouvelle("Des travaux enfin !", "Julie Deschamps");

		List<Nouvelle> nouvelles = new ArrayList<Nouvelle>();
		nouvelles.add(nouvelle1);
		nouvelles.add(nouvelle2);
		nouvelles.add(nouvelle3);
		nouvelles.add(nouvelle4);
		
		vue.afficherNouvelles2(nouvelles);		
	}

}
