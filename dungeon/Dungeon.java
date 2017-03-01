package dungeon;

public class Dungeon {
	
	
	/* 
	 * chooseHero allows the user to select a hero and returns the selected Hero
	 * 
	 */
		public static Hero chooseHero()
		{
			System.out.println("Choose a hero:\n" +
						       "1. Warrior\n" +
							   "2. Sorceress\n" +
							   "3. Thief");
			
			int choice = Keyboard.readInt();
			
			return CharacterFactory.createHero(choice);
			
		}//end chooseHero method
		
		

}
