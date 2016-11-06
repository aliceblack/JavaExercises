class D extends C{//es 3.11.8
	public void m1(){ super.m1(); print("D.m1");}
	public void m3(){print("D.m3");}
	public static void main(String args[]) {
		A ref1=new B(); A ref2=new D(); B ref3=new B();
		C ref4=new C(); C ref5=new D(); Object ref6=new C();
		
		
		//
		ref1.m1(); // A.m1 B.m2 
		ref2.m1(); //C.m1 D.m1
		ref4.m1(); //C.m1
		ref5.m1(); // C.m1 D.m1
		//ref6.m1(); // compilation failed
		ref1.m2(); //B.m2 
		ref2.m2(); // C.m2 C.m1 D.m1
		ref3.m2(); //B.m2
		System.out.println(" ");
		ref4.m2(); // C.m2 C.m1
		//ref6.m2(); //compilation failed
		ref3.m3(); // B.m3
		//ref5.m3(); // Compilation failed
		System.out.println(" ");
		((B)ref1).m3(); // B.m3
		System.out.println(" ");
		//((B)ref2).m3(); // Exception in thread "main" java.lang.ClassCastException: D cannot be cast to B at D.main(D.java:26)
		System.out.println(" ");
		((C)ref2).m2();//C.m2 C.m1 D.m1 
		System.out.println(" ");
		//((D)ref6).m2(); // C cannot be cated to D
	}
}
