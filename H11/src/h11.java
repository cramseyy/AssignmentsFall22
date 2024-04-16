import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
/* Author - Christian Ramsey Professor Tong 11/12/2022
 * In this assignment, we were instructed to modify a file we were provided with, by multiplying each 
 * number by 10, and displaying them in a separate file. The first important part of this assignment was creating the try and catch 
 * statements around all of the code. Secondly. creating the correct files and using the printwriter command to print out the
 * values of each file.
 */
public class h11{

public static void main(String[] args) {
	
	try {
	File file = new File("original.txt");

	if(file.exists()) {
		
			file.createNewFile();
		} 
	
	PrintWriter pw = new PrintWriter(file);
	pw.println("26\n"
			+ "12\n"
			+ "4\n"
			+ "89\n"
			+ "54\n"
			+ "65\n"
			+ "12\n"
			+ "65\n"
			+ "74\n"
			+ "3");
	pw.close();
	System.out.println("Done");
	
	File file1 = new File("original_scaled.txt");
	PrintWriter pw2 = new PrintWriter(file1);
		
		int a = 26 * 10;
		pw2.println(a);
		int b = 12 * 10;
		pw2.println(b);
		int c = 4 * 10;
		pw2.println(c);
		int d = 89 * 10;
		pw2.println(d);
		int e = 54 * 10;
		pw2.println(e);
		int f = 65 * 10;
		pw2.println(f);
		int g = 12 * 10;
		pw2.println(g);
		int h = 65 * 10;
		pw2.println(h);
		int i = 74 * 10;
		pw2.println(i);
		int j = 3 * 10;
		pw2.println(j);
		
		pw2.close();
	
	
	}
	
	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
