
public class Animation extends MyFrame{
	public void run() {
		
		int x=50;
		int y=50;
		
		while(y<=200){
			
			clear();
			
			setColor(0,128,0);
			fillOval(x,y,100,100);
			y+=5;
			x+=5;
			sleep(0.1);
		}
		while(x>=50) {
			
			clear();
			
			setColor(0,128,0);
			fillOval(x,y,100,100);
			x-=5;
			sleep(0.1);
		}
		while(y>50) {
		
			clear();
			
			setColor(0,128,0);
			fillOval(x,y,100,100);
			x+=5;
			y-=5;
			sleep(0.1);
		}
		
	}

}
