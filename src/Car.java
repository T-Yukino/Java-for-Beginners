
public class Car {
	
	int x,y;
	public Car(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void draw(MyFrame frame) {
		frame.fillOval(x, y, 20, 20);
		frame.fillOval(x+40, y, 20, 20);
		frame.fillRect(x+10,y-40,40,20);
		frame.fillRect(x-10, y-20, 80, 20);
	}

}
