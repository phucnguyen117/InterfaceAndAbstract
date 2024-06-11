package advance.dev;

class Dog extends Animal implements Runnable {
   @Override
   public void run() {
	   System.out.println("Dog is running....");
   }
}