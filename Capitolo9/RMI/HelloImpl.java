import java.rmi.*; //9.2.3 pagina184
import java.rmi.server.*;

public class HelloImpl extends UnicastRemoteObject implements Hello{
    public HelloImpl() throws RemoteException{}
    public String sayHello() throws RemoteException{return "HelloWorld!";}
}
