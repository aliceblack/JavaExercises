class Giocatore extends Thread{
    private  String name;
    private  Scacchiera scacchiera;
    private  int score=0;

    private int nmosse=0;
    public void updateMosse(){nmosse++; if (nmosse==30){
        try {
            scacchiera.updateTurno();
        }catch (Exception e){}}
    };
    public void tellScacchiera(){
        try{
            scacchiera.updateTurno();
        }catch (Exception e){}
    } //informa scacchiera di aver finito il turno

    Giocatore(String n, Scacchiera s){name=n; scacchiera=s;}
    public  void run(){
        for(int i=0; i<30; i++){
            System.out.println("mossa:"+i+" giocatore:"+name);
            int r=((int)(Math.random()*10))%Scacchiera.NRIGHE;
            int c=((int)(Math.random()*10))%Scacchiera.NCOLONNE;
            try{
                score +=scacchiera.add(r,c);
            }catch (Exception e){}
            updateMosse();
        }
        /**
         * entrambi i giocatori devono completare il primo turno
         * la partita deve essere al turno 2
         */
        try {
            while(scacchiera.getTurno2()==false){try { wait(); }catch (Exception e){}}
        }catch (Exception e){}
        for(int j=0; j<30; j++) {
            System.out.println("mossa:" + j + " giocatore:" + name);
            int rs = ((int) (Math.random() * 10)) % Scacchiera.NRIGHE;
            int cs = ((int) (Math.random() * 10)) % Scacchiera.NCOLONNE;
            try {
                score += scacchiera.add(rs, cs);
            }catch (Exception e){}
            updateMosse();
        }
    }

    public int getScore() {
        return score;
    }
}