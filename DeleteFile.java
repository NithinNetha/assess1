package assessProj;
import java.io.File;
public class DeleteFile {

	public DeleteFile(String filedel) {
		String name=filedel;
		File dFile =new File(name);
		if (dFile.delete()) { 
		      System.out.println("Deleted the file: " + dFile.getName());
		    } else {
		      System.out.println("File doesn't exist");
		    } 
	}

}
