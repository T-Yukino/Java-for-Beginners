
public class RectIf extends MyFrame{
	public void run() {
		
		int i;
		int x=0;
		int y=30;
		
		for(i=0; i<9 ; i++) {
			setColor(x,x,x);
			fillRect(y,50,10,100);
			x+=20;
			y+=20;
		}
	}
	

}
