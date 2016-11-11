class E extends D{//es 4.4.11
	
	public int g() {System.out.print("E.g() "); return 2;}
	
	public static void main(String[] args)
	{
		//primo frammento
		//X x=new D();
		//C c=x; //errore compilazione error: incompatible types: X cannot be converted to C
		//x.f();
		
		//secondo frammento
		//X x=new F();
		//Y y=x; //E.java:14: error: incompatible types: X cannot be converted to Y
		//y.g();
		
		//terzo frammento
		//X x=new C();
		//Y y=(C)x; //E.java:14: error: incompatible types: C cannot be converted to Y
		//y.g();
		
		//quarto frammento
		//Y y= new E();
		//D d=(D)y;
		//d.f(); //C.f()
		//y.g(); //E.g()
		
		//quinto frammento
		//Y y=new D();
		//X x=(E)y; //D cannot be casted to E
		//x.f(); y.g();
		
		//sesto frammento
		//Y y= new D();
		//X x=(D)y;
		//((E)x).g(); //D cannot be casted to E nel pezzetto (E)x
		
		//settimo frammento
		//C c=new D();
		//X x=(D)c;
		//Y y=(D)x;
		//y.g(); D.g()
		//x.f(); C.f()
		
		//ottavo frammento
		//C c=new E();
		//Y y=(D)c;
		//((E)c).f(); //C.f()
		//y.f(); //compilation failed cannot find symbol
		
	}
}
