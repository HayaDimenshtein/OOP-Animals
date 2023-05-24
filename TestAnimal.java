
public class TestAnimal {

	public static void main(String[] args) {
		Cat c = new Cat(true, true, 1);
		c.sayHello();
		c.sayHello(1);
		c.sayHello(0);
		System.out.println(c.getNumberOfLegs());

		Dog d = new Dog(true, true, 1);
		c.sayHello();
		c.sayHello(1);
		c.sayHello(0);
		System.out.println(d.getNumberOfLegs());
		
		Frog f = new Frog(false, false, 0);
		f.sayHello(0);
		f.sayHello(1);
		System.out.println(f.getNumberOfLegs());
		System.out.println(f.hasGills());
		System.out.println(f.hasLaysEggs());
		
	}

}
