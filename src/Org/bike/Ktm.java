package Org.bike;

public class Ktm implements Bike {
	@Override
	public void cost() {
		System.out.println("Bike cost is 1 Lakh");
	}
	@Override
	public void speed() {
     System.out.println("Bike speed is 10km/hr");		
	}

	public static void main(String[] args) {
    Ktm k=new Ktm();
    k.cost();
    k.speed();
	}

}
