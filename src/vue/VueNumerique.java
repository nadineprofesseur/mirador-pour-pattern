package vue;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurNumerique;

public class VueNumerique extends Vue {
	
	protected ControleurNumerique controleur;
	protected static VueNumerique instance = null; 
	public static VueNumerique getInstance() {if(null==instance)instance = new VueNumerique();return VueNumerique.instance;}; 
	
	private VueNumerique()  {
		super("numerique.fxml", VueNumerique.class);
		Logger.logMsg(Logger.INFO, "new VueNumerique()");
		super.controleur = this.controleur = new ControleurNumerique();
	}
	
}
