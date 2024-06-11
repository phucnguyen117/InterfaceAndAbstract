package advance.dev;

class AirPlain extends Machine implements Flyable {
     @Override
     public void fly() {
    	 System.out.println("AirPlain is flying....");
     }
}