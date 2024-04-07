package filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Session7 {

	public static void readFile() throws IOException {

		String filePath = "/Users/user/eclipse-workspace-mar24/AdvanceJavaMar24/src/resources/sample.txt";
		FileInputStream fis = new FileInputStream(filePath);
		int i = 0;
		while ((i = fis.read()) != -1) {
			System.out.print((char) i);
		}
		fis.close();
	}

	public static void readBufferedFile() throws IOException {

		String filePath = "/Users/user/eclipse-workspace-mar24/AdvanceJavaMar24/src/resources/sample1.txt";
		FileInputStream fis = new FileInputStream(filePath);
		BufferedInputStream bis = new BufferedInputStream(fis);
		int i = 0;
		while ((i = bis.read()) != -1) {
			System.out.print((char) i);
		}
		bis.close();
		fis.close();
	}

	public static void writeFile() throws IOException {
		FileOutputStream fout = new FileOutputStream(
				"/Users/user/eclipse-workspace-mar24/AdvanceJavaMar24/src/resources/sample.txt");
		String s = "Hello welcome to the session 7859";
		fout.write(s.getBytes());
		fout.close();
	}

	public static void writeFileUsingCharStream() throws IOException {
		String filePath = "/Users/user/eclipse-workspace-mar24/AdvanceJavaMar24/src/resources/sample2.txt";
		FileWriter fw = new FileWriter(filePath);
		fw.write("hello java hello python");
		fw.close();
	}

	public static void readFileUsingCharStream() throws IOException {
		String filePath = System.getProperty("user.dir") + "/src/resources/sample2.txt";

		FileReader fr = new FileReader(filePath);
		int i = 0;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}
	}
	
	public static void readPropertiesFile() throws IOException {
		String filePath = System.getProperty("user.dir") + "/src/resources/demo.properties";
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(filePath);
		prop.load(fis);
//		System.out.println(prop.getProperty("name"));
//		System.out.println(prop.getProperty("JavaSession"));
		Set set = prop.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

	public static void main(String[] args) throws IOException {
		String filePath = System.getProperty("user.dir") + "/src/resources/demo2.properties";
		Properties prop = new Properties();
		
		prop.setProperty("name", "Mithun");
		prop.setProperty("Language", "Java");
		prop.setProperty("PC", "Mac");
		prop.setProperty("SessionNo", "8");
		prop.store(new FileWriter(filePath), "Student data");
		
		
	}

}
