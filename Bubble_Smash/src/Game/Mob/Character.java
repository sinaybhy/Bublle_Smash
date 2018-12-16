package Game.Mob;



public abstract class Character {
	// attributs du personnage
	public String name;
	public int speed;
	public int heigh;
	public int LocX= 0;
	public int locY= 0;
	public int HP = 3;
	
	// getters
	public String getName() {
		return name;
	}
	public int getSpeed() {
		return speed;
	}
	public int getHeigh() {
		return heigh;
	}
	public int getLocX() {
		return LocX;
	}
	public int getLocY() {
		return locY;
	}
	public int getHP() {
		return HP;
	}
	
	//setters
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setHeigh(int heigh) {
		this.heigh = heigh;
	}
	public void setLocX(int locX) {
		LocX = locX;
	}
	public void setLocY(int locY) {
		this.locY = locY;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	
	
	public void Damage() { // dégats infligés à chaque contact avec une balle
		HP = HP -1; 
	}
	

}
