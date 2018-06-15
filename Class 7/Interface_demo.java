interface  Animal
{
public void speak();
public void eat();
}
class Dog implements Animal{
	public void speak(){
		System.out.println("Dog is speaking");
		}
	public void eat(){
			System.out.println("Dog is eating");
		}
}
    class Cat implements Animal{
      public void speak(){
		System.out.println("Cat is speaking");
		}
	  public void eat(){
			System.out.println("Cat is eating");
	}
}
	class Interface_demo{
	public static void main(String[] args){
	Dog d = new Dog();
	d.speak();
	d.eat();
	Cat c = new Cat();
	c.speak();
	c.eat();
	
	}
	}