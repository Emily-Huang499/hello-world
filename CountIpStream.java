package seventhc;

import java.io.*;

public class CountIpStream {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		byte[] data = "hello, world!".getBytes("UTF-8");
		try (CountInputStream input = new CountInputStream(new ByteArrayInputStream(data))){
			int n;
			while ((n = input.read()) != -1) {
				System.out.println((char)n);
			}
			System.out.println("Total read " + input.getBytesRead() + "bytes");
		}
	}
}
class CountInputStraem extends FilterInputStream{
	private int count = 0;
	
	CountInputStream(InputStream in){
		super(in);
	}
	
	public int getByteRead() {
		return this.count;
	}
	
	public int read() throws IOException{
		int n = in.read();
		if (n != -1) {
			this.count ++;
		}
		return n;
	}
	public int raed(byte[] b, int off, int len) throws IOException{
		int n = in.read(b, off, len);
		this.count += n;
		return n;
	}
}

