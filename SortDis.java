package assessProj;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortDis{

	public List<String> makeList() {
		File dir = new File(".");
		
		
		List<String> list = Arrays.asList(dir.list(
		   new FilenameFilter() {
		      @Override public boolean accept(File dir, String name) {		         	        	 
		    	  return name.matches("\\S+\\.(.*)");
		    	 }
		   }
		));
		
		for(int i=0;i<list.size();i++) {
			String str=list.get(i);
			list.set(i, str.toUpperCase());
		}
	return list;
	}
	public void disAccend(List<String> list) {
		if (list.isEmpty() == true)
            System.out.println("***There are no files to display***");
		else {
			for(String i:list)
				System.out.println(" "+i);
		}
	}
} 
