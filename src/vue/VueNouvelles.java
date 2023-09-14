package vue;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurNouvelles;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import modele.Nouvelle;

public class VueNouvelles extends Vue {

	protected ControleurNouvelles controleur = null;
	protected static VueNouvelles instance = null; 
	public static VueNouvelles getInstance() {if(null==instance)instance = new VueNouvelles();return VueNouvelles.instance;}; 

	private VueNouvelles() {
		super("nouvelles.fxml", VueNouvelles.class);
		Logger.logMsg(Logger.INFO, "new VueNouvelles()");
		super.controleur = this.controleur = new ControleurNouvelles();
	}

	// Fonction qui utilise les composants de liste existants
	public void afficherNouvelles(List<Nouvelle> nouvelles) {
		
		//Label titreVue = (Label)lookup("#nouvelle-titre-1");
		//titreVue.setText("test");
		
		int numero = 1;
		for(Nouvelle nouvelle:nouvelles)
		{
			// Arreter la boucle a 6
			if(numero > 6) break;
			
			// Generer les etiquettes en fonction du numero de nouvelle
			String etiquette = "#nouvelle-titre-" + numero;
			System.out.println(etiquette);
			numero++;
			
			// Afficher l'info
			Label titreVue = (Label)lookup(etiquette);
			titreVue.setText(nouvelle.getTitre());			
		}
	}
	
	// Fonction qui genere les composants
	public void afficherNouvelles2(List<Nouvelle> nouvelles) {
		
		GridPane vueNouvelles = (GridPane)lookup("#boite-nouvelles");
		vueNouvelles.getChildren().clear();
		
		int rangee = 0;
		int colonne = 0;
		for(Nouvelle nouvelle:nouvelles)
		{						
			Pane panneauNouvelle = new Pane();
			Label vueTitre = new Label("Test");
			panneauNouvelle.getChildren().add(vueTitre);
			vueNouvelles.getChildren().add(panneauNouvelle);
			vueNouvelles.setRowIndex(panneauNouvelle, rangee);
			vueNouvelles.setColumnIndex(panneauNouvelle, colonne);
			
			// recalcul des colonnes et rangees
			colonne++;
			if(colonne > 2)
			{
				colonne = 0;
				rangee++;
			}
		}
	}

}
