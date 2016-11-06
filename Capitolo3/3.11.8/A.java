class A{//es 3.11.8
	public void print(String s){System.out.print(s+" ");}
	public void m1(){print("A.m1"); m2();}
	public void m2(){print("A.m2");}
}
