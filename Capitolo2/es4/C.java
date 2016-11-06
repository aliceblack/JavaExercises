public class C{//es 2.11.4
	public static void F(Object r, Object s){
		Object t=r; r=s; s=t;
	}
	public static void main(String[] args){
		Integer x=new Integer(2), y=new Integer(3);
		F(x,y); System.out.print(x+" "+y);
		System.out.print(" *** ");
		String s= new String("pippo");
		F(x,s); System.out.print(x+" "+y+" "+s);
	}
}
