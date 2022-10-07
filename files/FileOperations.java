package com.simplilearn.files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
public static void main(String[] args) throws IOException {
	
	Scanner sc=new Scanner(System.in);
	
	while(true) {
		System.out.println("\n\nMain menu");
		System.out.println("Enter your choice: \n\t 1.Display\n\t 2.Add/Delete/Search\n\t 3.Exit from this program");
		int m=sc.nextInt();
		
		String path="F:\\ProjectFiles\\";
		
		switch(m) {
		
		case 1:
			System.out.println("Displaying all the files present in the path: "+path);
			File f=new File(path);
			File [] filenames=f.listFiles();								
			for(File ff : filenames) {								
				System.out.print(ff.getName()+"  ");					
					}
			break;
			
		case 2:
			boolean z=true;
			while(z) {
				System.out.println("\n\nSub-menu");
			System.out.println("\t2.Enter the operation to be done:\n\t\t a.Add files\n\t\t b.Delete files\n\t\t c.Search for a file\n\t\t d.Go to the main menu");
			String i=sc.next();
			switch(i) {
			
			case "a":{
				System.out.println("Enter the file to be created in path: "+path);
				String file=sc.next();

				
				File f1=new File(path+file);				
				boolean b1=f1.createNewFile();		
				
				if(b1!=true) {
					System.out.println("File is not created in path "+path);
					}
				else {
					System.out.println("File has been created in path: "+path);
				}
				break;
			}
			case "b":{
				System.out.println("Enter the file to be deleted in path: "+path);
				String file2=sc.next();

				File f2=new File(path+file2);
				boolean b2=f2.delete();			
				if(b2) {
					 System.out.println("File got deleted");
				 }
				 else {
					 System.out.println("File not found,,cannot be deleted");
				 }
				break;
			}
			case "c":{
				System.out.println("Enter the file name to be searched within the path: "+path);
				String file3=sc.next();
				
				File f3=new File(path);
				File [] filenames1=f3.listFiles();
				
				int flag=0;
				
				for(File ff: filenames1) {
					if(ff.getName().equals(file3)) {
						flag=1;
					
					}
				}

				if(flag==1) {
					System.out.println("File is present");
				}
				else {
					System.out.println("File not present");
				}
				break;
			}
			case "d":{
				z=false;
				break;
				}
			default:
				System.out.println("Invalid choice");
				break;
				
			}
			}
			break;
		case 3:
			System.exit(0);
			break;
			
			default:
				System.out.println("Invalid choice");
				break;
	}
	}

}
}
