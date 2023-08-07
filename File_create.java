// Import the File class
import java.io.File;

// Import the IOException class to handle errors
import java.io.IOException;

public class File_create {

	public static void main(String[] args)
	{

		try {
			final File Obj = new File("myfile.txt");
			
			if (Obj.createNewFile()) {
				System.out.println("File created: "
								+ Obj.getName());
			}
			else {
				System.out.println("File already exists.");
			}

			if (Obj.delete()){
				System.out.println("the file deleted is :"+Obj.getName());
			}
			else{
				System.out.println(" failed to delete the file.");
			}
		}
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}