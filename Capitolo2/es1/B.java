public class B{//es 2.11.1
	public static void n(Object[] a, Object[] b) {
		Object[] t=a; a[0]=b[0]; b[0]=t[0];
	}
	public static void main(String args[]) {
		String[] x={new String("a"), new String("b")};
		String[] y={new String("c"), new String("d")};
		n(x,y);
		System.out.println(x[0]+" "+x[1]); //c b
		System.out.println(y[0]+" "+y[1]); //c d
	}
}
