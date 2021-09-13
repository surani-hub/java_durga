import java.io.File;
import java.io.IOException;

class FileDemo{
	public static void main(String[] args) throws IOException{
		/*
		File f = new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		*/
		
		File f = new File("durga123");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
		File f1 = new File(f,"demo.txt");
		System.out.println(f1.exists());
		f1.createNewFile();
		System.out.println(f1.exists());
		
		//System.out.println(f1.delete());
		
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getCanonicalPath());
		
		System.out.println(f.getName());
		System.out.println(f1.getParent());
		
		//File files = new File("D:\\JAVA\\JavaByDurga");
		File files = new File("D:\\JAVA\\JavaByDurga\\Chap9_Multi_Threading");
		System.out.println(files.isFile());
		System.out.println(files.isDirectory());
		System.out.println(files.isAbsolute());
		 
		/* 
		int count = 0;
		String[] fileNames = files.list();
		for(int i=0;i<fileNames.length;i++){
			count++;
			System.out.println(fileNames[i]);
		} 
		System.out.println("total no of files and directories are : " + count);
		*/
		
		int count = 0;
		String[] fileNames = files.list();
		for(String s1: fileNames){
			File onlyFileNames = new File(files,s1);
			if(onlyFileNames.isFile()){
				count++;
				System.out.println(onlyFileNames);
			}
		} 
		System.out.println("total no of only files are : " + count);
	
	}
}