/**
 * 
 * @author Joshua Henderson
 *
 */
public class Application {

	public static void main(String[] args) {
		Wizard data = new Wizard();
		data.setName("Harry Potter");
		data.setHealth(100);
		data.setKey(0);
		System.out.println(data.getKey());
		data.lock(0);
		System.out.println("Is it locked?");
		System.out.println(data.isLocked());
		data.unlock(0);
		System.out.println("Is it locked?");
		System.out.println(data.isLocked());
		data.takeDamage(10);
		System.out.println(data.getName());
		System.out.println(data.getHealth());

	}

}
