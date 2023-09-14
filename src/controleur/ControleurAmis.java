package controleur;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;

public class ControleurAmis extends Controleur {

	public ControleurAmis()
	{
		Logger.logMsg(Logger.INFO, "new ControleurAmis()");
	}

	public void initialiser()
	{
	}

	
	public void notifierActionConvertir()
	{
		Logger.logMsg(Logger.INFO, "ControleurAmis.notifierActionConvertir()");
	}
	
}
