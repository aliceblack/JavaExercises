import java.rmi.*;

public class Server {
    public static void main(String [] a) throws Exception{


        try {
            ScacchieraImpl s = new ScacchieraImpl();
            Naming.rebind("rmi://localhost/scacchiera", s);
            System.out.println("server ready");
        }catch (Exception e){}
    }
}
