import java.net.*; //pagina180
import java.io.*;
import java.util.Scanner;

public class SimpleClient{
    private Socket s=null;
    private InetAddress ip; //stessa macchina
    private int port=3456;  //stessa macchina
    
    public void go() throws IOException{
		ip = InetAddress.getByName("127.0.0.1"); //localhost
		s=new Socket(ip,port); //tenta connessione al server
		
		try{
			Scanner input=new Scanner(s.getInputStream());
			OutputStream o=s.getOutputStream();
			PrintWriter output=new PrintWriter(o,true);
			String dato=input.next(); //legge un dato
			//elabora il dato
			System.out.println(dato);
			
			dato=input.next();//leggo il resto
			System.out.println(dato);
			
			dato=input.next();
			System.out.println(dato);
			
			System.out.println("Premi Enter per mandare la ricevuta");
			new Scanner(System.in).next();
			output.println("ricevuto!"); //manda un dato
		}finally{s.close();}//chiude sempre connessione ed esce
	}
	
	public static void main(String[] a) throws IOException{
		SimpleClient c=	new SimpleClient();
		c.go();
	}
		
}
