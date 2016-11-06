abstract class A extends B implements X{//es 4.4.9
	public void f() {System.out.print("A.f() ");}
	public void g() {System.out.print("A.g() ");}
	public abstract B f(B ref);
}
