package vue;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurMirador;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import modele.Nouvelle;
import modele.StatistiquesMeteores;
public class VueMirador extends Vue {

	protected ControleurMirador controleur;
	protected static VueMirador instance = null; 
	public static VueMirador getInstance() {if(null==instance)instance = new VueMirador();return VueMirador.instance;}; 
	
	private VueMirador() 
	{
		super("mirador.fxml", VueMirador.class);
		super.controleur = this.controleur = new ControleurMirador();
		Logger.logMsg(Logger.INFO, "new VueMirador()");
	}
	
	public void afficherNombreAstronautes(int nombre)
	{
		Label vueNombreAstronautes = (Label)lookup("#nombre-astronautes");
		vueNombreAstronautes.setText(nombre + " astronautes");
	}
			
	public void afficherStatistiquesMeteores(StatistiquesMeteores statistiques) {
		
		Label vueMin = (Label)lookup("#meteore-taille-min");
		Label vueMoyenne = (Label)lookup("#meteore-taille-moyenne");
		Label vueMax = (Label)lookup("#meteore-taille-max");
		
		vueMin.setText("Min : " + statistiques.getMasseMin());
		vueMax.setText("Max : " + statistiques.getMasseMax());
		vueMoyenne.setText("Moyenne : " + statistiques.getMasseMoyenne());
	}
	
	public void afficherNouvelles(List<Nouvelle> nouvelles) {
		
		TextArea vueNouvelles = (TextArea)lookup("#nouvelles-spacex");
		//vueNouvelles.setText("Test");
		//vueNouvelles.appendText(" suite");
		
		for(Nouvelle nouvelle : nouvelles)
		{
			vueNouvelles.appendText(nouvelle.getTitre() + " ");
			vueNouvelles.appendText("(" + nouvelle.getAuteur() + ")\n");
		}
	}
	
	public void activerControles()
	{
		super.activerControles();
	}



}
