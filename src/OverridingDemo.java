import java.util.*;
class Animal
{
	void move()
	{
		System.out.println("Animal is moving");
	}
}
class Dog extends Animal
{
	void move()
	{
		System.out.println("Dog is Moving");
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
		Animal obj= new Animal();
		obj.move();
		
		Animal obj2= new Dog();
		obj2.move();
		
		
		
	}

}
