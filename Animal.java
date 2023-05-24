
public abstract class Animal {
	
	private boolean mammals;
	private boolean carnivorous;
	private int mood;
	public static final int MOOD_HAPPY=1;
	public static final int MOOD_SCARE=0;
	
	public Animal(boolean isMammal, boolean isCarnivorous, int mood)
	{
		this.mammals=isMammal;
		this.carnivorous=isCarnivorous;
		this.mood=mood;
	}
	
	public void setMood(int new_mood)
	{
		this.mood=new_mood;
	}
	
	public abstract void sayHello();
	
	public abstract void sayHello(int currentMood );
	
	public boolean isMammals()
	{
		return mammals;
	}
	
	public void setMammals(boolean isMammal)
	{
		this.mammals=isMammal;
	}
	
	public boolean isCarnivorous()
	{
		return carnivorous;
	}
	
	public void setCarnivorous(boolean isCarnivorous)
	{
		this.carnivorous=isCarnivorous;
	}

}
