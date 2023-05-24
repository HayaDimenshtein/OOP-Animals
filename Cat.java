
public class Cat extends Animal implements Land {
	
public static final int numberOfLegs=4;
	
	public Cat(boolean isMammal, boolean isCarnivorous, int mood)
	{
		super(isMammal, isCarnivorous, mood);
	}
	
	@Override
	public void sayHello()
	{
		System.out.println("Cat is meowing");
	}
	
	@Override
	public void sayHello(int currentMood)
	{
		if(currentMood == MOOD_HAPPY)
		{
			System.out.println("Cat is purring, purring.");
			setMood(currentMood);
		}
		else if (currentMood == MOOD_SCARE)
			 {
			 	System.out.println("Cat is hissing.");
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
