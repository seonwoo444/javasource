package inheritance;

/*
 * class Ballpen { 
 *  private int amount; // ���� ��
 *  private String color; // ������ ��
 *  public int getAmount() { return amount; }
 *  public void setAmount (int amount) { this.amount = amount; }
 *  public String getColor() { return color; }
 *  public void setColor(String color) { this.color = color; }}
 */

public class BallPen extends Pencil {
	private String color;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}







