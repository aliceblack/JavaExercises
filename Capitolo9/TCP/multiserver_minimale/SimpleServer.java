import java.net.*; //9.1.3 pagina180
import java.io.*;
public class SimpleServer{
	private int port=3456;
	private ServerSocket s =null;
	
	public void activate() throws IOException{
		try{//crea server che accetta connessioni
			s=new ServerSocket(port);
		}catch(IOException e){System.err.println("Could not listen on port "+ port);
			System.exit(1);}
	
	
	//rimane in attesa di connessioni
		while(true){
			Socket s1=s.accept();
			ServerThread st=new ServerThread(s1);
			st.start();
		}
	}
	
    public static void main(String[] a) throws IOException{
		SimpleServer s=new SimpleServer();
		s.activate();
        }
}
