/**
 * 
 */

/**
 * @author dmarcot
 *
 */
public class Character {
	String skill;
	Weapon weapon;
	int speed;
	int strength;
	
	public Character(){
		skill = null;
		weapon = null;
		speed = 0;
		strength = 0;
	}
	
	public Character(String skill, Weapon weapon, int speed, int strength){
		this.skill = skill;
		this.weapon = weapon;
		this.speed = speed;
		this.strength = strength;
	}
}