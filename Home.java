package assessProj;
import java.io.*;
public class Home {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int ch;
		String filecreate;
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		String line="Welcome to LockedMe.com"+
					"\nDeveloped by Nithin Palarapu";
		System.out.println(line);
		do {
			System.out.println("Select option from following list");
			System.out.println("\t1.Add file\n\t2.Delete file\n\t3.Search file\n\t4.Display files\n\t5.Exit");
			ch=Integer.parseInt(reader.readLine());
			if(ch>5)
				System.out.println("***Entered output is invalid***\n");
			switch(ch) {
			case 1:
				System.out.print("Enter file name to create: ");
				filecreate=reader.readLine();
				AddFile af= new AddFile(filecreate);
				break;
			case 2:
				//Deletefile();
				break;
			case 3:
				//Search();
				break;
			case 4:
				//Display();
				break;
			}
		}while(ch!=5);
		System.out.println("\nThanks for using this applicaion");
	}

}
