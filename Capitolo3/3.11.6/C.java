class C{//es 3.11.8
	public static void m(Integer[] b1, Integer[] b2){
		if(b1 instanceof Integer[]  && b2 instanceof Integer[] && b1[0]!=null && b2[0]!=null)
		{ Integer[] k=new Integer[2]; k[0]=b1[0]; b1[0]=b2[0]; b2[0]=k[0];}
	} 
	
	public static void main(String args[]) {
		Integer[] a1 ={new Integer(2), new Integer(9)};
		Integer[] a2 ={new Integer(4), new Integer(7)};
		Integer[] a3 ={null, new Integer(5)};
		Integer[] a4 ={new Integer(6), new Integer(1)};
		m(a1,a2);
		System.out.println(a1[0]+" "+a2[0]); //stampa 4 2
		m(a3,a4);
		System.out.println(a3[0]+" "+a4[0]); //stampa null 6
		m(a4,null);
		System.out.println(a4[0]); //stampa 6
	}
}
