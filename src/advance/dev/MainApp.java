package advance.dev;

public class MainApp {
     public static void main(String[] args) {
    	 Dog dog = new Dog();
    	 dog.eat();
    	 dog.run();
    	 Fish fish = new Fish();
    	 fish.eat();
    	 fish.swim();
    	 Bird bird = new Bird();
    	 bird.eat();
    	 bird.fly();
    	 Car car = new Car();
    	 car.fuel();
    	 car.run();
    	 AirPlain airplain = new AirPlain();
    	 airplain.fuel();
    	 airplain.fly();
     }
}