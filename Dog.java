
public class Dog extends Animal implements Land{
	
	public static final int numberOfLegs=4;
	
	public Dog(boolean isMammal, boolean isCarnivorous, int mood)
	{
		super(isMammal, isCarnivorous, mood);
	}
	

	@Override
	public void sayHello()
	{
		System.out.println("Dog is wagging it's tail");
	}
	
	@Override
	public void sayHello(int currentMood)
	{
		if(currentMood == MOOD_HAPPY)
		{
			System.out.println("Dog is barking loudly.");
			setMood(currentMood);
		}
		else if (currentMood == MOOD_SCARE)
			 {
			 	System.out.println("Dog is making a whooping sound.");
			 	setMood(currentMood);
			 }
			else
				sayHello();
	}
	
	@Override
	public int getNumberOfLegs()
	{
		return numberOfLegs;
	}
}
