package modele;

public class StatistiquesMeteores {
	
	protected float masseMin;
	protected float masseMoyenne;
	protected float masseMax;
	
	public StatistiquesMeteores()
	{
		
	}
	
	public StatistiquesMeteores(float masseMin,  float masseMoyenne, float masseMax) {
		super();
		this.masseMin = masseMin;
		this.masseMax = masseMax;
		this.masseMoyenne = masseMoyenne;
	}
	
	public float getMasseMoyenne() {
		return masseMoyenne;
	}
	public void setMasseMoyenne(float masseMoyenne) {
		this.masseMoyenne = masseMoyenne;
	}
	public float getMasseMax() {
		return masseMax;
	}
	public void setMasseMax(float masseMax) {
		this.masseMax = masseMax;
	}
	public float getMasseMin() {
		return masseMin;
	}
	public void setMasseMin(float masseMin) {
		this.masseMin = masseMin;
	}
	
	

}
