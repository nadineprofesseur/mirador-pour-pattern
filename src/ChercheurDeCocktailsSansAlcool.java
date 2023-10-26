import java.util.ArrayList;
import java.util.List;

import modele.Cocktail;

public class ChercheurDeCocktailsSansAlcool extends ChercheurDeCocktails{

	public ChercheurDeCocktailsSansAlcool(List<Cocktail> cocktails) {
		super(cocktails);
	}
	
	public List<Cocktail> filtrerSelonAlcool(List<Cocktail> cocktails)
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
