class B{//es 4.4.10
	public static boolean F(Object r){
		if(r instanceof String) {return true;}
		return false;
	}
	
	 
	
	public static void main(String[] args)
	{
		String k="word1";
		Object j;
		j=k;
		Object c="word2";
		boolean r=F(k);
		if(r){System.out.print(r);}
	}
}
