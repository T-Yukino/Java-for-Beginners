
public class RectIf extends MyFrame{
	public void run() {
		
		setColor(0,128,0);
		int i;
		int x=30;
		int y=0;
		
		for(i=0; i<9 ; i++) {
			if(i==1) {
				fillRect(x,50,10,10+y);
			}
			else{
				fillRect(x,50,10,10+y);
			}
			x+=20;
			y+=20;
		}
	}
	

}
