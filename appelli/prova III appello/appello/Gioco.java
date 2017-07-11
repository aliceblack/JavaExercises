public class Gioco {

    public static void  main (String[] a){
        Scacchiera s= new Scacchiera();
        Giocatore g1 = new Giocatore("pippo",s);
        Giocatore g2 = new Giocatore("pluto",s);
        g1.start(); g2.start();

        try {g1.join();}catch (Exception e){}
        try {g2.join();}catch (Exception e){}
        System.out.println("g1: "+g1.getScore()+"   g2:"+g2.getScore());
    }
}
