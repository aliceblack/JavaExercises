import java.rmi.*;

public class Host2 {
    public static void  main(String[] a) throws Exception{
        try {
            Scacchiera si = (Scacchiera) Naming.lookup("rmi://localhost/scacchiera");

            Giocatore g1 = new Giocatore("pluto", si);
            g1.start();
            System.out.println("host2 ready");
        }catch (Exception e){}
    }
}