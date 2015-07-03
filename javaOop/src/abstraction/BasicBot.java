package abstraction;

public class BasicBot implements Robot {
     int energy = 0; // 에너지
     int attack = 10; //공격력
     int hp = 100; // 체력 체력이 0 이 되면 죽음
     int speed = 0;
	
	
	
	
	
	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	public void status(){
		System.out.println("[hp]"+getHp()+"\n"
				+ "[에너지]"+getEnergy()+"\n");
	}
	

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public int attack() {
		return 0;
		
	}

	@Override
	public void shield(int attack) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void chargeEnergy(int energy) {
		// TODO Auto-generated method stub
		
	}

}
