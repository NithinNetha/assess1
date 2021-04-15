package assessProj;
//import java.io.*;
import java.util.*;
public class FileSearch {

	public FileSearch(List<String> list, String ser) { //Searching using Naive Pattern Searching
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