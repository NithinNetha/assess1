package assessProj;
import java.io.File;  
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
public class AddFile extends Home{    //inheritance to get & store path of file
	public AddFile(String name) {  //AddFile definition with name of file
	File aFile=new File(name); //initializing File class
	boolean result;
	if(name.matches("\\S+\\.(.*)")==true) //check if file name is in proper format
	{
		
	try
	{  
		result = aFile.createNewFile();  //creates a new file  
		if(result)      // test if successfully created a new file  
		{  
			System.out.print("file created at "); //returns the path string  
			String temp=aFile.getCanonicalPath();
			Path path=Paths.get(temp);
			path = path.getParent();
			System.out.println(path);
		}  
		else  
		{  
			System.out.println("File already exist at location: ");  
		}  
	}catch (IOException e){ e.printStackTrace();}
	}
	else
		System.out.println("Entered name is not a proper format");
	}
}
