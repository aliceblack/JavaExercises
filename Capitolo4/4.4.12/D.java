class D extends B implements X{//es 4.4.12
	public void f() {System.out.print("D.f() ");}
	
	public void g() {System.out.print("D.g() ");}
	
	public void h(int n) {System.out.print("D.h(int) ");}
	
	public static void f(X r, Y s){
		if(r instanceof Y) {
			Y y=(Y)r; y.g(); System.out.print("r  istance of Y ");
		}
		if(s instanceof B) {
			s.g(); System.out.print("s  istance of B ");
			}
	}
	
	public static void main(String[] args)
	{
		//primo frammento
		//X x=new D(); Y y=new B();
		//C c=(C)x; // D cannot be cast to C
		//D.f(c,y);
		
		//secondo frammento
		//Y y=new D();
		//Y z=new C();
		//D d=(D)y;
		//d.f(); //D.f()
		//C c=(C)d; // D cannot be converted to C
		//c.f();
		
		//terzo frammento
		//X x=new C();
		//Y y=(Y)x;
		//y.g(); //B.g()
		//x.f(); //C.f()
		//B b=(B)y;
		//b.f(); compilation failed
		
		//quarto frammento
		//C c=new C();
		//Y y=c;
		//X x=(X)y;
		//B b=(B)x;
		//b.g(); //B.g
		//b.h(); //B.h
		
		//quinto frammento
		//X x=new D();
		//B b=(B)x;
		//B b1=new C();
		//D.f(x,b);
		//D.f(x,b1);
		
		//sesto frammento
		//X x=new D();
		//Y y=new B();
		//((B)y).h();
		//D.f(x,y);
		
		//settimo frammento
		//X x=new D();
		//B b=new C();
		//B b1=(B)x;
		//((C)b1).f(); //D cannot vbe casted to C
		//X x1=(C)b;
		
		//ottavo frammento
		//B b=new D();
		//B b1=new C();
		//Y y=(D)b1;// C cannot be  casted to D
		
		//nono frammento
		X x=new D();
		B b=new C();
		B b1=(B)x;
		X x1=(C)b;
		X x2=(X)b1;
		x1.f(); //C.f()
		x2.f(); //D.f()
		
		
	}
}
