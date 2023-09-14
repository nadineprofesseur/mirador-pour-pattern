package vue;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurAmis;

public class VueAmis extends Vue {
	
	protected ControleurAmis controleur;
	
	protected static VueAmis instance = null; 
	public static VueAmis getInstance()  { if(null==instance) instance = new VueAmis(); return VueAmis.instance;}; 
	
	private VueAmis()  {
		super("amis.fxml", VueAmis.class);
		Logger.logMsg(Logger.INFO, "new VueAmis()");
		super.controleur = this.controleur = new ControleurAmis();
	}
	
	//void afficherAmis(List<Amis> listeAmis)
	//{
	//}
}
