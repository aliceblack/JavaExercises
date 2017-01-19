import java.io.*;
import java.util.*;
public class Sostituisci{
	public static void main(String[] args)throws IOException{
		String file1, file2;
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci nome dei file");
		file1=input.next();
		file2=input.next();
		PrintWriter out=new PrintWriter(new File(file2));
		Scanner in = new Scanner(new File(file1));
		while(in.hasNext() ){
			int n=in.nextInt();//se non sono del tipo specificato si ha IOException
			out.println(n);
			out.flush();//svuota il buffer
		}
		
		
		out.close(); in.close();
	}
}
