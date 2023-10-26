package donnee;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import modele.Nouvelle;

public class NouvelleDAO {
	public static final String URL_LISTE_SORTIES = "https://www.jeuxactu.com/rss/sorties.rss";	
	public List<Nouvelle> listerNouvelles()
	{
		List<Nouvelle> nouvelles = new ArrayList<Nouvelle>();
		
		// TELECHARGER = Recupere les donnees de internet en xml

		String xml = "";
		try {
			URL url = new URL(URL_LISTE_SORTIES);
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter("\\A"); // marque que delimiteur est la fin du document
			xml = lecteur.next();
			lecteur.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(xml);
		
		// PARSER = Transformer le xml en une liste d'objets Nouvelle
		try {
			DocumentBuilder parseur = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			//byte[] octets = xml.getBytes(); // il y a pas de stream de string donc on utilise les octets
			//InputStream flux = new ByteArrayInputStream(octets); // enveloppe les octets en un flux
			//parseur.parse(flux); // on veut un flux inputstream
			
			Document document = parseur.parse(new ByteArrayInputStream(xml.getBytes()));
			NodeList listeNoeudsItems = document.getElementsByTagName("item");
			System.out.println(listeNoeudsItems.getLength());

			for(int position = 0; position<listeNoeudsItems.getLength(); position++)
			{
				Element noeudItem = (Element)listeNoeudsItems.item(position);
				String titre = noeudItem.getElementsByTagName("title").item(0).getTextContent();
				//System.out.println("Titre : " + titre);
				
				Nouvelle nouvelle = new Nouvelle(titre,"");
				nouvelles.add(nouvelle);				
			}
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		// RETOURNER
		return nouvelles;
		
	}

}
