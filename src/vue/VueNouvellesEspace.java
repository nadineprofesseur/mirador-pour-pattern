package vue;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurNouvelles;
import controleur.ControleurNouvellesEspace;

public class VueNouvellesEspace extends Vue {

	protected ControleurNouvellesEspace controleur = null;
	protected static VueNouvellesEspace instance = null; 
	public static VueNouvellesEspace getInstance() {if(null==instance)instance = new VueNouvellesEspace();return VueNouvellesEspace.instance;}; 

	private VueNouvellesEspace() {
		super("nouvelles.fxml", VueNouvellesEspace.class);
		Logger.logMsg(Logger.INFO, "new VueNouvellesEspace()");
		super.controleur = this.controleur = new ControleurNouvellesEspace();
	}
	

}
