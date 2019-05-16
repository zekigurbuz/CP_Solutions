import java.util.*;

import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class keytocrypto {

	public static void main(String[] args) throws Exception {
		new keytocrypto().run();
	}

	public void run() throws Exception {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		String ciphertext = file.readLine();
		String key = file.readLine();
		String message = "";
		int shift = 0;
		for (int i = 0; i < ciphertext.length(); i++) {
			shift = (ciphertext.charAt(i) - key.charAt(i)) % 26;
			key += shift < 0 ? (char) (91 + shift) : (char) (65 + shift);
			message += shift < 0 ? (char) (91 + shift) : (char) (65 + shift);
		}
		System.out.println(message);
	}
}
