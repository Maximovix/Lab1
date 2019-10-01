# Lab1
public class MyClass {
    public static void main(String args[]) {
      Animal cat = new Animal(new Cat());
      Animal dog =  new Animal(new Dog());
      cat.behavior();
      dog.behavior();
      
    }
}
interface IBehavior{
    public void aggressiveBehavior();
}

class Cat implements IBehavior{
    @Override
        public void aggressiveBehavior(){
            System.out.print("Cat: Scratch"+ "\n");
    }
}

class Dog implements IBehavior{
    @Override
        public void aggressiveBehavior(){
            System.out.print("Dog: Bite"+ "\n");
    }
}

class Monkey implements IBehavior{
    @Override
        public void aggressiveBehavior(){
            System.out.print("Monkey: Jumps" + "\n");
    }
}

class Animal{
  private IBehavior behavior;
  
  Animal(IBehavior behavior){
      this.behavior = behavior;
  }
  
  public void behavior(){
      behavior.aggressiveBehavior();
  } 
  }
