import java.net.*; //pagina178
public class IPFinder{
    public static void main(String[] a){
        String host="java.sun.com";
        try{InetAddress localadd=InetAddress.getLocalHost();
        InetAddress address=InetAddress.getByName(host);
        System.out.println(address+" local:"+localadd);
        }catch(UnknownHostException e){System.out.println(host+"sconosciuto");}
    }
}
