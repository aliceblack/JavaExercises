public class E extends D{//es 3.11.3
	public E(){
		Integer i =new Integer(s);
		System.out.println(i.intValue());
	}
	public int m(D ref) {return 5;}
	public static void main(String args[]) {
		C r=new C(5); //2
		C s=new D(); //3
		D t=new E(); //4 2522
		E u=new E(); //5 25222
		System.out.println(r.m(t)+" "+s.m(r)+" "+t.m(s)+" "+u.m(t));
	}
}
