package eleventh;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class CodingTestOne {

	public static void main(String[] args) {
		String encoded = URLEncoder.encode("美人瑜", StandardCharsets.UTF_8);
		System.out.println(encoded);
		
		String decoded = URLDecoder.decode("%E7%BE%8E%E4%BA%BA%E7%91%9C", StandardCharsets.UTF_8);
		System.out.println(decoded);
	}
}
