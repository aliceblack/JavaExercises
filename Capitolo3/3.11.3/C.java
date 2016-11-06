public class C{//es 3.11.3
	protected static String s="2";
	public C(){this(2);}
	public C(int n){s=s+n; System.out.println(s.length()+" s="+s);}
	public int m(C ref){
		if(ref instanceof D){return 2;}
		else {return 1;}
	}
	
}
