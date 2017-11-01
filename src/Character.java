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
	Spell spell;
	int speed;
	int strength;
	
	public Character(){
		skill = null;
		weapon = null;
		speed = 0;
		strength = 0;
		spell = null;
	}
	
	public Character(String skill, Weapon weapon, int speed, int strength, Spell spell){
		this.skill = skill;
		this.weapon = weapon;
		this.speed = speed;
		this.strength = strength;
		this.spell = spell;
	}
}
