package abstraction;

public class ShieldBot extends BasicBot {
	Robot robot;

	public int attack() {
		return robot.attack();
	}

	public void shield(int attack) {
		robot.shield((int) (attack * 0.2));

	}

	public void run() {
		robot.run();
		speed -= 5;

	}

	public void status() {
		super.status();
	}

	public void chargeEnergy(int energy) {
	}
}
