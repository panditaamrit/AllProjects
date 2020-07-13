package Files;

import java.io.File;

public class test1 {
	
public static void main(String args[]) {
	
	//int count=0;;
	File f= new File("D:\\amrit\\MyFirstFrameWorkV1");
	File[] files=f.listFiles();
	System.out.println(files.length);
	
}

}
