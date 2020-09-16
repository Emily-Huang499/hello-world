package eleventh;

import java.util.Arrays;
import java.util.Base64;

public class CodingTestFour {

	public static void main(String[] args) {
		byte[] input = new byte[] {(byte)0x01, (byte)0x02, (byte)0x7f, (byte)0x00};
		String b64encoded = Base64.getUrlEncoder().encodeToString(input);
		System.out.println(b64encoded);
		byte[] output = Base64.getUrlDecoder().decode(b64encoded);
		System.out.println(Arrays.toString(output));
	}
}
