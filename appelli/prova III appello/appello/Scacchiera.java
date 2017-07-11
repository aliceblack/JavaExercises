class Scacchiera{
    public static final int NRIGHE = 8;
    public static final int NCOLONNE = 8;

    private int fineTurnoGiocatore=0; //turni dei giocatori
    private boolean turno2=false; //turno della partita
    // 1 turno partita = 1 turno g1 + 1 turno g2

    public synchronized void updateTurno(){
        fineTurnoGiocatore++;
        if(fineTurnoGiocatore%2==0){
            swap();
            turno2 = true;
        }
    }
    public synchronized boolean getTurno2(){return turno2;}

    private  Casella[] board = new Casella[NRIGHE*NCOLONNE];
    public Scacchiera(){
        boolean bianco=true;
        for(int i=0; i<NRIGHE*NCOLONNE; i++){
            board[i]=new Casella(bianco); bianco=!bianco;
        }
    }
    public void swap(){
        System.out.println("  +++Swap colori scacchiera+++  ");
        for(Casella c: board) c.swapColor();}

    public int tot(){
        int t=0;
        for(Casella c: board){
            t+=c.size();
        }
        return  t;
    }
    public int add(int r, int c){
        Casella casella=board[c*r];
        int punteggio = casella.add();
        return  punteggio;
    }
}