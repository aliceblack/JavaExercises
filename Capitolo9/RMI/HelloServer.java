import java.rmi.*; //9.2.3 pagina184

public class HelloServer{
	private static final String HOST="localhost";
	public static void main(String[] a) throws Exception{
		HelloImpl ref=new HelloImpl();
		String rmiObjName="rmi://"+HOST+"/Hello";
		Naming.rebind(rmiObjName,ref);
		System.out.println("ServerPronto");
	}
}
