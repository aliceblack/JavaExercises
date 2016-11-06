class C extends A{//es 3.11.8
	public void m1(){print("C.m1");}
	public void m2(){print("C.m2"); m1();}
}
