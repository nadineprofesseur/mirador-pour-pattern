import java.util.ArrayList;
import java.util.List;

import modele.Cocktail;

public class ChercheurSemantiqueDeCocktails extends ChercheurDeCocktails {

	protected String mot;
	public ChercheurSemantiqueDeCocktails(List<Cocktail> cocktails, String mot) {
		super(cocktails);
		this.mot = mot;
	}

	public List<Cocktail> filterParIngredients(List<Cocktail> cocktails)
	{
		List<Cocktail> selection = new ArrayList<Cocktail>();
		
		for(Cocktail cocktail:cocktails)
		{
			//if(condition)
			selection.add(cocktail);
		}
		
		return selection;
	}
	public List<Cocktail> filtrerSelonMotsCles(List<Cocktail> cocktails)
	{
		List<Cocktail> selection = new ArrayList<Cocktail>();
		for(Cocktail cocktail:cocktails)
		{
			//if(condition)
			selection.add(cocktail);
		}
		
		return selection;
	}	
	
}
