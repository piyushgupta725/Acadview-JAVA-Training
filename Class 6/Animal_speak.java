class Animal{
	int breed ;
	int color;
	void speak(){
	System.out.println("animal is speaking");
	}
}
class Dog extends Animal{
	void speak(){
	System.out.println("Dog is speaking");
}
}
class Cat extends Animal{
	void speak(){
	System.out.println("Cat is speaking");
	}	
}
class Animal_speak{
	public static void main(String[] args)
	{
		Animal a =new Animal();
		a.speak();
		Dog d =new Dog();
		d.speak();
		Cat c =new Cat();
		c.speak();
	}
}