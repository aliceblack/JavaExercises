class D extends C{//es 3.3.3
	Z x=new Z(5), y=new Z(6);
	D(){super(); x=new Z(7);}
	public static void main(String args[]) {
		D d=new D();
		System.out.print("\n"+d.i.z+" "+d.j.z+" "+d.x.z+" "+d.y.z);
	}
	
}
