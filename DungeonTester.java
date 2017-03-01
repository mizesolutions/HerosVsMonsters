/**
 * Title: DungeonTester.java
 *
 * Description: Driver file for Heroes and Monsters project
 *
 * Copyright:    Copyright (c) 2001
 * Company: Code Dogs Inc.
 * I.M. Knurdy
 *
 * History:
 *  11/4/2001: Wrote program
 *    --created DungeonCharacter class
 *    --created Hero class
 *    --created Monster class
 *    --had Hero battle Monster
 *    --fixed attack quirks (dead monster can no longer attack)
 *    --made Hero and Monster abstract
 *    --created Warrior
 *    --created Ogre
 *    --made Warrior and Ogre battle
 *    --added battleChoices to Hero
 *    --added special skill to Warrior
 *    --made Warrior and Ogre battle
 *    --created Sorceress
 *    --created Thief
 *    --created Skeleton
 *    --created Gremlin
 *    --added game play features to DungeonTester.java (this file)
 *  11/27/2001: Finished documenting program
 * version 1.0
 */

import dungeon.*;


public class DungeonTester {
    
	public static void main(String[] args) {

		Battle battle = new Battle();
		
		do {
		    
			battle.battle();

		} while (battle.battleAgain());
		

    }//end main

    
}//end DungeonTester class