
public class PingPongRunnable implements Runnable{
	private String parola;
	private int delay;
	
	public PingPongRunnable(String s, int d){ //parola e millisecondi di delay
		parola=s; delay=d;
	}
	
	public void run(){
		try{
			
			for(int x=0; x<300; x++){
				System.out.print(parola+" ");
				Thread.sleep(delay);
				
			}
		}
		catch(InterruptedException e){return;}
	}
	
	public static void main(String[] s){
		Runnable ping=new PingPongRunnable("ping",29);
		Runnable pong=new PingPongRunnable("PONG",29);
		Thread t1=new Thread(ping);
		t1.start();
		Thread t2=new Thread(pong);
		t2.start();

	}	
}
