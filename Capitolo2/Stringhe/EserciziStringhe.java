public class EserciziStringhe{//Esercizi 2.3.1 e 2.3.2
	public static void main(String args[]) {
		String s="pippo"; String t="pippo";
		System.out.println(s==t);
		
		String s1=new String("pippo");
		String t1=new String("pippo");
		System.out.println(s1==t1);
		
		String p=new String("pippo");
		String s2=p; String t2=p;
		System.out.println(s2==t2);
		
		String s3=new String(p);
		String t3=new String(p);
		System.out.println(s3==t3);
		
		int i=3;
		int j=2;
		System.out.println("la somma vale");
		System.out.println(i+j);
		
		System.out.println("la somma vale "+i+j);
		
		System.out.println("la somma vale "+ (i+j));
		
		System.out.println(i+j+" era la somma");
	}
}
