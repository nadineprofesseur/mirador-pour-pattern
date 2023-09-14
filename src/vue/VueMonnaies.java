package vue;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurMonnaies;

public class VueMonnaies extends Vue {
	
	protected ControleurMonnaies controleur = null;
	protected static VueMonnaies instance = null; 
	public static VueMonnaies getInstance() {if(null==instance)instance = new VueMonnaies();return VueMonnaies.instance;}; 
	
	private VueMonnaies()  {
		super("monnaies.fxml", VueMonnaies.class);
		Logger.logMsg(Logger.INFO, "new VueMonnaies()");
		super.controleur = this.controleur = new ControleurMonnaies();
	}
	
}
