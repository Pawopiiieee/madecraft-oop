package exercises;

public class SmurfFactory {
	public static void main(String[] args) {
		Smurf papa = Smurf.createSmurf("papa");
		papa.printName();
		papa.eat();
		Smurf.createSmurf("papa");
		Smurf.createSmurf("papa");
		Smurf.createSmurf("papa");
		Smurf.createSmurf("papa");
		Smurf.createSmurf("papa");
		
		Smurf luca = Smurf.createSmurf("luca");
		luca.printName();
		Smurf.createSmurf("boba");
		Smurf.createSmurf("boba");
		Smurf.createSmurf("boba");
		Smurf.createSmurf("boba");
		Smurf.createSmurf("boba");
	}

}
