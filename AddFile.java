package assessProj;
import java.io.File;  
import java.io.IOException; 
public class AddFile {
	public AddFile(String name) {
	File aFile=new File(name);
	boolean result;
	try   
	{  
		result = aFile.createNewFile();  //creates a new file  
		if(result)      // test if successfully created a new file  
		{  
			System.out.println("file created "+aFile.getCanonicalPath()); //returns the path string  
		}  
		else  
		{  
			System.out.println("File already exist at location: "+aFile.getCanonicalPath());  
		}  
	}   catch (IOException e){ e.printStackTrace();	}
	}
}
