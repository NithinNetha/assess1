package assessProj;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;
import java.util.*;
public class FileSearch {
	BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
	public FileSearch(List<String> list) throws IOException { //Searching using Naive Pattern Searching
		int ch=0;
		do {
			try {
				System.out.print("Enter file name to search: ");
				String ser=reader.readLine();
				int flag=0;
				String name=ser.toUpperCase();
				for(String txt:list)
					{
						int M=name.length();
						int N=txt.length();
						/* A loop to slide pat one by one */
						for (int i = 0; i <= N - M; i++) {
	  
							int j;
	  
							/* For current index i, check for pattern 
	              			match */
							for (j = 0; j < M; j++)
								if (txt.charAt(i + j) != name.charAt(j))
									break;
								// if name[0...M-1] = txt[i, i+1, ...i+M-1]
							if ((j == M) && ((name.charAt(M-1)==txt.charAt(N-1)) || (txt.charAt(j)=='.'))) 
							{ 
								System.out.println("Found "+txt); 
								flag++;
							}
						}
		
					}
				if(flag==0)
					System.out.println("File not found");
				System.out.println("\n\t1.Search one more file\n\t2.Main Menu\nSelect options from above");
				ch=Integer.parseInt(reader.readLine());
				if(ch>2)
					System.out.println("***Entered output is invalid***\n");
			}catch(NumberFormatException e) {System.out.println(e+" Enter options in integer format");}
		}while(ch!=2);
	}

}

/*{
	// Get the file
    File f = new File(name);

    // Check if the specified file
    // Exists or not
    if (f.exists())
        System.out.println("Exists");
    else
        System.out.println("Does not Exists");
}*/