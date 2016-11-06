public class Esercizio{//es 3.11.2
	public static String G(Object s){
		if(s instanceof String) {return s+"***";};
		return "XXX";
	}
	public static void Fun(Object[] a){
		if(a instanceof String[]) 
			{a[0]=a[1]; a[1]=G(a[1]);}
		else if(a[0] instanceof String)
			{a[1]=a[0]; a[0]=G(a[0]);}
	}
	
	//public static void main(String args[]) {
	//	Object[] x={new String("pippo"), new Integer(5)};
	//	Fun(x); System.out.print(x[0]+" "+x[1]);
	//}
	
	//public static void main(String args[]) {
	//	String[] y={new String("pluto"), new String("topolino")};
	//	Fun(y); System.out.print(y[0]+" "+y[1]);
	//}
	
	//public static void main(String args[]) {
	//	Integer[] z={new Integer(8), new Integer(9)};
	//	Fun(z); System.out.print(z[0]+" "+z[1]);
	//}
	
	public static void main(String args[]) {
		Object[] w={new Integer(3), new String("Paperino")};
		Fun(w); System.out.print(w[0]+" "+w[1]);
	}
}
