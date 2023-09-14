package vue;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurCommentaires;

public class VueCommentaires extends Vue {
	
	protected ControleurCommentaires controleur = null;
	protected static VueCommentaires instance = null; 
	public static VueCommentaires getInstance() {if(null==instance)instance = new VueCommentaires();return VueCommentaires.instance;}; 
	
	private VueCommentaires()  {
		super("commentaires.fxml", VueCommentaires.class);
		Logger.logMsg(Logger.INFO, "new VueCommentaires()");
		super.controleur = this.controleur = new ControleurCommentaires();
	}
	
}
