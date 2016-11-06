class L{//es 4.4.8
	public String smsL;
	String destinatario, mittente;
	L(String sm){smsL=sm;}
	void setDestinatario(String s){destinatario=s;};
	void setMittente(String m){mittente=m;};
	void aggiungi(Character c){smsL=smsL+c;};
	public String toString(){
		System.out.println("Mittente: "+mittente); 
		System.out.println("DEstinatario: "+destinatario); 
		
		for(int i=0; i<smsL.length(); i++)
		{
			String[] text = smsL.split("");
			if(i%25 == 0){System.out.println(" ");}
			System.out.print(text[i]);
			}
		
		System.out.println(" ");  
		System.out.println("___"); 
		return smsL;
	};

	public static void main(String[] args)
	{

		L first=new L("Hi Jack!Howdy?Let me know if u coming tonite!see ya");
		first.setMittente("User");
		first.setDestinatario("Jack");
		first.toString();
		Character h='!';
		first.aggiungi(h);
		first.toString();
		
		N second=new N("Fine dude!Coming tonite see ya#####################################################");
		second.toString();
		second.aggiungi(h);
		second.toString();
	}

}
