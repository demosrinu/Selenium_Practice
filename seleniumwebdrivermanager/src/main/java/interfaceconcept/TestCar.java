package interfaceconcept;

public class TestCar {

	public static void main(String[] args) {
		
		/*method over-riding: when same method present in parent class as well as child class
		  preference will be given to child class*/
		//static polymorphism = compile time polymorphism
		
		Honda h = new Honda();
		h.start();//method over ridden.. start() from Honda called while start() from car is also present
		h.stop();
		h.theftsafety();
		h.refuel();
		h.engine();
		h.wheel();
		
		System.out.println("*****");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		//c.theftsafety(); can't be accessed 
		
		
		System.out.println("*****");
		
		//top casting
		//dynamic polymorphism = runtime polymorphism
		//child class object can be referred by parent class reference variable
		Car c1 = new Honda();
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.theftsafety(); can't be accessed
		
		//down casting
		//Honda h1 = (Honda) new Car(); //class cast exception
	}

}
