package FileHandling;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
class FileOperation{
	Scanner sc=new Scanner(System.in);
	String path="C:\\Assessment\\";
public void AppendFile() throws IOException {
	System.out.println("enter the filename");
	String filename1=sc.next();
	String finalpath=path+filename1;
	File f1=new File(finalpath);
	//create a new file
	boolean b=f1.createNewFile();
	if(b!=true) {
		System.out.println("file not created");
	}
	else {
		System.out.println("file created");
	}
}
public void ReadFile() throws IOException{
	System.out.println("enter the file name");
	String filename1=sc.nextLine();
	String finalpath1=path+filename1;
	FileInputStream fi=new FileInputStream(finalpath1);
	if(fi!=null) {
		System.out.println("file exists");
	}
	int i=0;
	//-1 is EOF
	while((i=fi.read())!=-1){
		System.out.print((char)i);
	}

	fi.close();
	
}
public void WriteFile() throws IOException{
	System.out.println("enter the file name");
	String filename2=sc.nextLine();
	String finalpath2=path+filename2;
	FileOutputStream fo=new FileOutputStream(finalpath2,true);
	if(fo!=null) {
		System.out.println("file existed and opened in write mode");
	}
	System.out.println("enter the content to write on the file ");
	String fileinput=sc.nextLine();
	byte b[]=fileinput.getBytes();
	fo.write(b);
	System.out.println("write operation completed");
	fo.close();
	}


}
public class FileHandlingProject {
	public static void main(String[] args) throws IOException {
		System.out.println("Choose which operation has to be done!!"+"\n"+"1.Append files"+"\n"+"2.Read files"+"\n"+"3.Write files");
		Scanner sc=new Scanner(System.in);
		FileOperation f=new FileOperation();
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
	         f.AppendFile();
	         break;
		case 2:
			f.ReadFile();
			break;
		case 3:
			f.WriteFile();
			break;
		}
	}

}
