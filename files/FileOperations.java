package com.simplilearn.files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {
public static void main(String[] args) throws IOException {
	
	Scanner sc=new Scanner(System.in);
	
	while(true) {
		System.out.println("\n\nEnter your choice: \n 1.Display\n 2.Add/Delete/Search\n 3.Exit from this program");
		int a=sc.nextInt();
		
		String path="F:\\ProjectFiles\\";
		
		switch(a) {
		
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
			System.out.println("\n\nEnter the operation to be done:\n 1.Add files\n 2.Delete files\n 3.Search for a file\n 4.Exit from this sub-menu");
			int b=sc.nextInt();
			switch(b) {
			
			case 1:{
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
			case 2:{
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
			case 3:{
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
			case 4:{
				z=false;
				break;
				}
			}
			}
break;
		case 3:
			System.exit(0);
			break;
	}
	}

}
}
