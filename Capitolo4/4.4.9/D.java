class D extends A{//es 4.4.9
	public static B st= new B();
	public void f() {System.out.print("D.f() ");}
	public B f(B ref){
		if(ref instanceof A){ System.out.print("istanceof A "); return (D)ref; } 
		System.out.print("ritorno st ");
		return st; 
	}
	
	public static void main(String[] args)
	{
		//primo frammento
		//B b = new A();  //error: A is abstract; cannot be instantiated
		//X x= (A)b;
		//x.f();
		
		//secondo frammento
		//A a=new D();
		//B b=a;
		//b.g(); //"A.g()"
		//a.g(); //"A.g()"
		//a.f(b); // if nel caso istanceof A 
		
		//terzo frammento
		//B b=new D();
		//A a1=(A)b;
		//A a2=(D)b;
		//a1.f(); //D.f()
		//a2.f(); //D.f()
		
		//quarto frammento
		//D d= new D();
		//B b1=d;
		//B b2=d.f(b1);
		//b2.g(); //A.g()
		
		//quinto frammento
		//B b1= new B();
		//A a=new D();
		//B b2=a.f(b1);//ritorna st
		//X x=(D)b2; //Exception in thread "main" java.lang.ClassCastException: B cannot be cast to D
		
		//sesto frammento
		//X x= new C();
		//C c=(C)x;
		//B b=new D();
		//c.f(b); //C.f(Object)
		
		//settimo frammento
		//X x=new C();
		//B b=new B();
		//x.f(b); // errore di compilazione: method f in interface X cannot be applied to given types;
		
		//ottavo frammento
		A a=new D();
		C c=(C)(a.f(a));// e' un istance of A e ritorna un D. quindi (C)tipoD non si puo fare, D cannot be cat to C
		
	}
}
