import java.util.ArrayList;
import java.util.List;

import modele.Cocktail;

public class ChercheurDeCocktail {

	protected List<Cocktail> tousLesCocktails;
	protected List<Cocktail> selection;
	
	public ChercheurDeCocktail(List<Cocktail> cocktails)
	{
		this.tousLesCocktails = cocktails;
	}
	
	public void executer()
	{	
		this.selection = filtrerSelonMotsCles(this.tousLesCocktails);
		this.selection = filtrerSelonAlcool(selection);
		this.selection = filterParIngredients(selection);
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
