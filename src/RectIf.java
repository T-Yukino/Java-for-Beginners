
public class RectIf extends MyFrame{
	public void run() {
		
		setColor(0,128,0);
		int i;
		int x=30;
		int y=50;
		
		for(i=0; i<9 ; i++) {
			if(i==1) {
				fillRect(x,y,10,100);
			}
			else{
				fillRect(x,y,10,100);
			}
			x+=20;
			y+=20;
		}
	}
	

}
