package eleventh;

import java.util.Arrays;
import java.util.Base64;

public class CodingTestThree {

	public static void main(String[] args) {
		byte[] input = new byte[] {(byte)0xe4, (byte)0xb8, (byte)0xad, (byte)0x21};
		String b64encoded = Base64.getEncoder().encodeToString(input);
		System.out.println(b64encoded);
		String b64encoded2 = Base64.getEncoder().withoutPadding().encodeToString(input);
		System.out.println(b64encoded2);
		
		byte[] output = Base64.getDecoder().decode(b64encoded2);
		System.out.println(Arrays.toString(output));
	}
}
