
public class Frog extends Animal implements Land, Water{
	
public static final int numberOfLegs=4;
	
	public Frog(boolean isMammal, boolean isCarnivorous, int mood)
	{
		super(isMammal, isCarnivorous, mood);
	}
	

	@Override
	public void sayHello(){}
	
	@Override
	public void sayHello(int currentMood)
	{
		if(currentMood == MOOD_HAPPY)
		{
			System.out.println("Frog is singing 'quack quack quack' on the shore");
			setMood(currentMood);
		}
		else if (currentMood == MOOD_SCARE)
			 {
		   	 	System.out.println("Frog is ploping into the water.");
		   	 	setMood(currentMood);
			 }
	}
	
	@Override
	public int getNumberOfLegs()
	{
		return numberOfLegs;
	}


	@Override
	public boolean hasGills() {
		//Frogs do have gills.
		return true;
	}


	@Override
	public boolean hasLaysEggs() {
		// Frogs are oviparous.
		return true;
	}

}
