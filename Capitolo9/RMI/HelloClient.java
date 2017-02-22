import java.rmi.*; //9.2.3 pagina184

public class HelloClient{
	private static final String HOST="localhost";
	public static void main(String[] a) throws Exception{
			try{Hello ref=(Hello) Naming.lookup("rmi://"+HOST+"/Hello");
				System.out.println("msg ricevuto:"+ref.sayHello());}
				//catch(ConnectionException e){
				//	System.out.println("problemi di connessione a server");}
				catch(Exception exc){ exc.printStackTrace();}
		}
}

//per avviare l'esercizio:
//rmiregistry
//java HelloServer
//java HelloClient
