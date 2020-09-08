package seventhc;

import java.io.*;

public class LfFilter {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f = new File("C:\\Windows");
        File[] fs1 = f.listFiles();
        printFiles(fs1);
        File[] fs2 = f.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".exe");
            }
        });
        printFiles(fs2);
    }

    static void printFiles(File[] files) {
        System.out.println("==========");
        if (files != null) {
            for (File f : files) {
                System.out.println(f);
            }
        }
        System.out.println("==========");
    }
}
