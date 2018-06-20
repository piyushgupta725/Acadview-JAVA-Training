import java.io.*;
class Copying{
	public static void main(String[] args) throws IOException{
		int b;
		FileReader fir = new FileReader("C:\\Users\\PIYUSH\\Desktop\\Acadview\\Class 10\\abc.txt");
		FileWriter fiw = new FileWriter("C:\\Users\\PIYUSH\\Desktop\\Acadview\\Class 10\\xyz.txt");
			while(( b = fir.read())!=-1)
		{
			fiw.write((char)b);
			fiw.flush();
			System.out.print((char)b);
		}
	}
}