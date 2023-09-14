package vue;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurMessages;

public class VueMessages extends Vue {
	
	protected ControleurMessages controleur;
	protected static VueMessages instance = null; 
	public static VueMessages getInstance() {if(null==instance)instance = new VueMessages();return VueMessages.instance;}; 

	private VueMessages() {
		super("messages.fxml", VueMessages.class);
		Logger.logMsg(Logger.INFO, "new VueMessages()");
		super.controleur = this.controleur = new ControleurMessages();
	}
}
