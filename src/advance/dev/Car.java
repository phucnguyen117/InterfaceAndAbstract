package advance.dev;

 class Car extends Machine implements Runnable {
    @Override
    public void run() {
    	System.out.println("Car is running....");
    }
}