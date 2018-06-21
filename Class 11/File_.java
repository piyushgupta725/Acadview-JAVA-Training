import java.io.*;
class File_{
	public static void main(String[] args){
	File F = new File("C:\\Users\\PIYUSH\\Desktop\\Acadview\\Class 2");
			File[] filesl = F.listFiles();
			for(File New_File_List : filesl){
			System.out.println(New_File_List.getName() +": "+ New_File_List.getPath());
			if(New_File_List.isDirectory()){
			File[] Inner_files = New_File_List.listFiles();
	for(File Inner_files_List : Inner_files){
	System.out.println(Inner_files_List.getName() +": "+ Inner_files_List.getPath());
}				
}		
}	
}
}