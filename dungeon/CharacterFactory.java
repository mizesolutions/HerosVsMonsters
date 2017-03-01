package dungeon;

import java.util.Random;

public class CharacterFactory {
	
	private static Random rand;
	
	public static Hero createHero(int type) {
		
		switch(type) {
			case 1: return new Warrior();

			case 2: return new Sorceress();

			case 3: return new Thief();

			default: System.out.println("invalid choice, returning Thief");
				     return new Thief();
		}//end switch

	} //end createHero
	
	
	public static Monster createMonster() {
		
		rand = new Random();
		int choice = rand.nextInt(2)+1;

		switch(choice){
			case 1: return new Ogre();

			case 2: return new Gremlin();

			case 3: return new Skeleton();

			default: System.out.println("invalid choice, returning Skeleton");
				     return new Skeleton();
		}//end switch
		
	} // end createMonster


}
