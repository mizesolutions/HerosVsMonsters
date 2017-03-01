package dungeon;

public class Battle {
	
	private Hero theHero;
	private Monster theMonster;
	private char pause;
	private char again;
	
	
	public Battle() {
		
		theHero = chooseHero();
		theMonster = CharacterFactory.createMonster();
		pause = 'p';
		again = 'n';
		
	}
	
	
/* 
 * chooseHero allows the user to select a hero and returns the selected Hero
 *
 */
	public Hero chooseHero() {
		
		System.out.println("Choose a hero:\n" +
					       "1. Warrior\n" +
						   "2. Sorceress\n" +
						   "3. Thief");
		
		int choice = Keyboard.readInt();
		
		return CharacterFactory.createHero(choice);
		
	}//end chooseHero
	
	
/*
 * battle is the actual combat portion of the game.  It requires a Hero
 * and a Monster to be passed in.  Battle occurs in rounds.  The Hero
 * goes first, then the Monster.  At the conclusion of each round, the
 * user has the option of quitting.
 * 
 */
	public void battle() {
		
		battleStart();

		while (theHero.isAlive() && theMonster.isAlive() && pause != 'q') {
			theHero.battleChoices(theMonster);

			if (theMonster.isAlive())
			    theMonster.attack(theHero);

			System.out.print("\n-->q to quit, anything else to continue: ");
			
			pause = Keyboard.readChar();

		}
		
		battleResults();
		
	}//end battle
	
	
	
	private void battleStart() {
		
		System.out.println(theHero.getName() + " battles " +
				theMonster.getName());
		System.out.println("---------------------------------------------\n");
		
	}
	
	
	
	private void battleResults() {
		
		if (!theMonster.isAlive())
		    System.out.println(theHero.getName() + " was victorious!");
		else if (!theHero.isAlive())
			System.out.println(theHero.getName() + " was defeated");
		else  
			System.out.println("Quitters never win."); 
		    //both are alive so user quit the game
		
	}
	
	
	
	public boolean battleAgain() {

		System.out.println("Play again (y/n)?");
		
		again = Keyboard.readChar();

		return (again == 'Y' || again == 'y');
		
	}//end playAgain

}
