/**
 * 
 */

/**
 * @author dmarcot
 *
 */
public class Spell {
	String name;
	int attack;
	int speed;
	
	
	public Spell(){
		name = null;
		attack = 0;
		speed = 0;
	}
	
	public Spell(String name, int attack, int speed){
		this.name = name;
		this.attack = attack;
		this.speed = speed;
	}
}