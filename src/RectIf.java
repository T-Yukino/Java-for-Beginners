
public class RectIf extends MyFrame{
	public void run() {
		
		int i;
		int x=0;
		int y=30;
		
		for(i=0; i<20 ; i++) {
			if(i<9) {
				setColor(x,x,x);
				fillRect(y,50,10,100);
			x+=28;
			y+=20;
			}
			else {
				setColor(x,x,x);
				fillRect(y,50,10,100);
				x-=28;
				y+=20;
			}
			
			
		}
	}
	

}
