import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Scacchiera extends Remote{
    public static final int NRIGHE = 8;
    public static final int NCOLONNE = 8;

    public void updateTurno() throws RemoteException;
    public int add(int a, int b) throws RemoteException;
    public boolean getTurno2() throws RemoteException;

}
