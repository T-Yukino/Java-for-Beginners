
public class Animation extends MyFrame{
	public void run() {
		
		int x=30;
		int y=200;
		
		while(y>=30){
			
			clear();
			
			setColor(0,128,0);
			fillOval(x,y,100,100);
			y-=5;
			sleep(0.1);
		}
		while(x<=200) {
			
			clear();
			
			setColor(0,128,0);
			fillOval(x,y,100,100);
			x+=5;
			sleep(0.1);
		}
		
	}

}
