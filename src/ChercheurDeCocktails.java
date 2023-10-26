import java.util.ArrayList;
import java.util.List;

import modele.Cocktail;

public class ChercheurDeCocktails {

	protected List<Cocktail> tousLesCocktails;
	protected List<Cocktail> selection;
	
	public ChercheurDeCocktails(List<Cocktail> cocktails)
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
		return cocktails;
	}
	public List<Cocktail> filtrerSelonAlcool(List<Cocktail> cocktails)
	{
		return cocktails;
	}
	public List<Cocktail> filtrerSelonMotsCles(List<Cocktail> cocktails)
	{
		return cocktails;
	}	
}
