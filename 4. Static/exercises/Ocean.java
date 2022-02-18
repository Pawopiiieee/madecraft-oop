package exercises;

public class Ocean {
	public static void main(String[] args) {
		SeaCreature spongeBob = new SeaCreature("SpongeBob");
		SeaCreature patrick = new SeaCreature("Patrick");
		SeaCreature squidWard = new SeaCreature("SquidWard");
		spongeBob.eat();
		spongeBob.laugh();
		
		System.out.println(patrick.getName());
		patrick.laugh();
		
		System.out.println(squidWard.getName());
		
		squidWard.laugh();
	}

}
