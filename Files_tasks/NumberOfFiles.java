import java.io.File;
import java.util.Scanner;
public class NumberOfFiles {
	public static void main(String[] agrs)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter path");
		String path=sc.nextLine();
		File f=new File(path);
		int fileCont=0;
		int floderCount=0;
		for(File file:f.listFiles())
		{
			if(file.isFile())
			{
				fileCont++;
			}
			if(file.isDirectory())
			{
				floderCount++;
				for(File f2:file.listFiles())
				{
					if(f2.isFile())
					{
						fileCont++;
					}
				}
			}
			
		}
		System.out.println("number of files : "+fileCont);
		System.out.println("number of folders : "+floderCount);
	}
}
