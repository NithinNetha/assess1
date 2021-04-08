package assessProj;
import java.io.*;
public class Home {

	public static void main(String[] args) throws IOException {
		int ch;
		String filecreate, filedel;
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		String line="Welcome to LockedMe.com"+
					"\nDeveloped by Nithin Palarapu";
		System.out.println(line); //print welcome note
		do {
			System.out.println("Select option from following list"); //Asking input for options
			System.out.println("\t1.Add file\n\t2.Delete file\n\t3.Search file\n\t4.Display files\n\t5.Exit");
			ch=Integer.parseInt(reader.readLine()); //Takes input for option.
			if(ch>5)
				System.out.println("***Entered output is invalid***\n"); //prints when wrong option selected.
			switch(ch) { //start switch case for entered options
			case 1: //Add files
				System.out.print("Enter file name to create: "); //ask for file name.
				filecreate=reader.readLine(); //reads file name.
				AddFile af= new AddFile(filecreate); //AddFile() method is called.
				break;
			case 2: //Delete file
				System.out.print("Enter file name to delete: ");
				filedel=reader.readLine();
				DeleteFile df= new DeleteFile(filedel);
				break;
			case 3: //Search desired file
				//Search();
				break;
			case 4: //Display files in alphabetical order.
				//Display();
				break;
			}
		}while(ch!=5); //do..while() loop exits if option selected is 5.
		System.out.println("\nThanks for using this applicaion"); //Thanks greet.
	}

}
