import java.net.*; //9.1.3 pagina180
import java.io.*;
import java.util.Scanner;

public class ServerThread extends Thread{
    private Socket s=null;
    public ServerThread(Socket socket){super("ServerThread"); s=socket;}
    
    public void run(){
		try{
			OutputStream o=s.getOutputStream();
			PrintWriter output=new PrintWriter(o,true);
			InputStream i=s.getInputStream();
			Scanner input=new Scanner(i);
			output.println("Ciao caro client!"); //spedisce un dato
			String dato=input.next(); //legge un dato
			System.out.println(dato); //elabora il dato
		}catch(IOException e){System.err.println("I/O exception"); 
			System.exit(1);
			}finally{
				try{s.close();
					}catch(IOException e){
						System.err.println("Something went wrong");
						System.exit(0);} 
			} 
	}
}
