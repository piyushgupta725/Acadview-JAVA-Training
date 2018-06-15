abstract class Animal{
	abstract public void eat();
	public void speak(){
		System.out.println("Animal is speaking");
}}
class Cat extends Animal{
	public void eat(){
	System.out.println("cat is eating ");
	}
}	
class Abstract_class{
	public static void main(String[] args){
	Cat c = new Cat();
	c.eat();
	c.speak();
	}
}