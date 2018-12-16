package Game.Mob;

public class Bubble {
	// Attributs des bubble
	public int sizeB;
	public int speedB;
	public int [][] direction = new int [1][1];
	public int color;


	// Getters
	public int getSizeB() {
		return sizeB;
	}
	public int getSpeedB() {
		return speedB;
	}
	public int [][] getDirection() {
		return direction;
	}
	public int getColor() {
		return color;
	}

	// Setters
	public void setSizeB(int sizeB) {
		this.sizeB = sizeB;
	}
	public void setSpeedB(int speedB) {
		this.speedB = speedB;
	}
	public void setDirection(int[][] direction) {
		this.direction = direction;
	}
	public void setcolors(int color) {
		this.color = color;
	}

	public void Moving (Bubble b) {
		int X = b.getDirection()[0][0];
		int Y = b.getDirection()[1][0];
		
	}
}
