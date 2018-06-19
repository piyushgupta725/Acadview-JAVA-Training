import java.io.*;
class Readfile{
	public static void main(String[] args) throws FileNotFoundException
	{int b;
		
		try{
		FileInputStream fin = new FileInputStream("E:\\abc.txt");
		while((b =fin.read()) != -1)
		{
			System.out.println((char) b);
		}
		}
		catch(Exception e){System.out.println(e);}
	}
}