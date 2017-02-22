import java.rmi.*; //9.2.3 pagina184

public interface Hello extends Remote{
    public String sayHello() throws RemoteException;
}
