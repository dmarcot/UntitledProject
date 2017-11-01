/**
 * 
 */

/**
 * @author dmarcot
 *
 */
public class Level {
	int level;
	int attackIncrease;
	int defenseIncrease;
	int speedIncrease;
	
	public Level(){
		level = 0;
		attackIncrease = 0;
		defenseIncrease = 0;
		speedIncrease = 0;
	}
	
	public Level( int level, int attackIncrease, int defenseIncrease, int speedIncrease){
		this.level = level;
		this.attackIncrease = attackIncrease;
		this.defenseIncrease = defenseIncrease;
		this.speedIncrease = speedIncrease;
	}
}
