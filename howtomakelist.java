package learnwithAli;
import java.util.ArrayList;  

public class howtomakelist {
	public static ArrayList<String> cars = new ArrayList<String>();
	public static void main(String[]args){
		 cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    cars.set(0, "Opel");
		    cars.remove(0);
		    System.out.println(cars);
	}
}
