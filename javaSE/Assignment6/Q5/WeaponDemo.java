/*
5) Code this:
create a new project
	create a package "weaponpack"
		inside this package

	public class Weapon
	{
		public void attack()
		{
		}
	}
	public class Sword extends Weapon
	{
		override attack
	}
	public class Bomb extends Weapon
	{
		override attack
	}
	public class Gun extends Weapon
	{
		override attack
			+
		public void fillBullets()
		{
			S.o.p("filling bullets");
		}
	}

	public class Soldier
	{
		// define "fight" method in such a way that given any specific weapon, it should be able to attack
		public void fight(Weapon ref)
		{
			ref.attack();
			// make sure you invoke "fillBullets" also along with "attack" and that shouldn't give "ClassCastException"
		}

	}
	public class WeaponDemo
	{
		p.s.v.main()
		{
			//invoke "fight" method of Soldier class
			Soldier s1=new Soldier();
			s1.fight(new Gun());
		}
	}
*/
/**
 * 
 */
package weaponpack;

/**
 * @author Vedant
 *
 */
public class WeaponDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soldier s1=new Soldier();
		s1.fight(new Gun());
	}
}	

