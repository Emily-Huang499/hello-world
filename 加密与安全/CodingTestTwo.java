package eleventh;

import java.util.Arrays;
import java.util.Base64;

public class CodingTestTwo {

	public static void main(String[] args) {
		byte[] input = new byte[] {(byte)0xe4, (byte)0xb8, (byte)0xad};
		String b64encoded = Base64.getEncoder().encodeToString(input);
		System.out.println(b64encoded);
		
		byte[] output = Base64.getDecoder().decode("5Lit");
		System.out.println(Arrays.toString(output));
		
	}
}
