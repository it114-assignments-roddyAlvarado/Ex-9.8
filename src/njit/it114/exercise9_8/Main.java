/**
 * 
 */
package njit.it114.exercise9_8;

/**
 * @author roddy a
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fan = new Fan();
		Fan fan2 = new Fan();
		fan.setSpeed(Fan.fast); fan.setRadius(10); fan.setColor("yellow"); fan.setOn(true);
		fan2.setSpeed(Fan.medium); fan2.setRadius(5); fan2.setColor("blue"); fan2.setOn(false);
		System.out.println(fan.toString());
		System.out.println(fan2.toString());

	}

}
