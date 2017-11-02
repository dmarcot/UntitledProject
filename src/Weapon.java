/**
 * 
 */

/**
 * @author dmarcot
 *
 */
public class Weapon {
	String name;
	int attack;
	int speed;
	
	public Weapon(){
		name = null;
		attack = 0;
		speed = 0;
	}
	
	public Weapon(String name, int attack, int speed){
		this.name = name;
		this.attack = attack;
		this.speed = speed;
	}
}
