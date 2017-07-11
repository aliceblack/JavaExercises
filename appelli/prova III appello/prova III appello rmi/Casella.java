class Casella{
    private boolean bianco;
    private int contenuto=0; //pedine su casella
    Casella(boolean b){bianco=b;}
    void swapColor(){ bianco=!bianco;}
    int size(){return contenuto;}
    public synchronized  int add(){
        if(bianco==true){contenuto++; return 0;}
        else{int mangiate=this.size(); contenuto=1; return mangiate;}
    }
}