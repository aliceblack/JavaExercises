import java.io.*;
import java.util.Scanner;
public class Sovrascrivi{
	public static void main(String[] args)throws IOException, FileNotFoundException{
		Scanner in = new Scanner(new File("inFile.txt"));
		PrintWriter out=new PrintWriter(new File("outFile.txt"));
		String item=in.next();//se non sono del tipo specificato si ha IOException
		int number=in.nextInt();//se non sono del tipo specificato si ha IOException
		out.println("pippo"); //perdiamo vecchio contenuto
		in.close();
		out.close();
	}
}
