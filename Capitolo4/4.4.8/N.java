class N{//es 4.4.8
	public String smsN;
	String destinatario, mittente;
	N(String sm){smsN=sm;}
	void setDestinatario(String s){destinatario=s;};
	void setMittente(String m){mittente=m;};
	void aggiungi(Character c){if(smsN.length()<160){smsN=smsN+c;}};
	public String toString(){
		System.out.println("Mittente: "+mittente); 
		System.out.println("DEstinatario: "+destinatario); 
		
		for(int i=0; i<smsN.length(); i++)
		{
			String[] text = smsN.split("");
			if(i%25 == 0){System.out.println(" ");}
			if(i>160) break;
			System.out.print(text[i]);
			}
		
		System.out.println(" ");  
		System.out.println("___"); 
		return smsN;
	};
}
