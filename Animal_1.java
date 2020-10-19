class Animal_1
{
public void eat()
{
System.out.println("i am eating");
}
}



class Dog extends Animal_1
{
public static void main(String[] args)
{

Dog d=new Dog();
d.eat();

}

}