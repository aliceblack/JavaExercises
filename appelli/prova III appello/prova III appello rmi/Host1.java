import java.rmi.*;

public class Host1 {
    public static void  main(String[] a) throws Exception{

        try {
            Scacchiera si=(Scacchiera)Naming.lookup("rmi://localhost/scacchiera");
            Giocatore g1 = new Giocatore("pippo", si);
            g1.start();
            System.out.println("host1 ready");
        }catch (Exception e){}

    }
}
