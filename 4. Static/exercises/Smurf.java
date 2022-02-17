package exercises;

import java.util.ArrayList;
import java.util.List;

public class Smurf {

	private String name;
	static List <String> listName = new ArrayList<String>();


	public static Smurf createSmurf(String name) {
		
		if (!listName.contains(name)) {
			listName.add(name);
			System.out.println("Creating " + name + " Smurf");
			return new Smurf(name);
		}
		return null;
		
	}

	Smurf(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

}
