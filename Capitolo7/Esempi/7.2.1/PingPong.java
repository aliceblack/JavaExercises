
public class PingPong extends Thread{
	private String parola;
	private int delay;
	
	public PingPong(String s, int d){ //parola e millisecondi di delay
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
		Thread t1=new PingPong("ping",66);
		t1.start();
		Thread t2=new PingPong("PONG",66);
		t2.start();

	}	
}
