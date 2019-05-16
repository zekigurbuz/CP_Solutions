import java.util.ArrayList;
import java.util.Collections;

public class E024 {
	public static void main(String[] args) {
		String key = "0123456789";
		ArrayList<String> combs = new ArrayList();
		for (int i = 0; i < key.length(); i++) {
			for (int j = 0; j < key.length(); j++) {
				for (int k = 0; k < key.length(); k++) {
					for (int g = 0; g < key.length(); g++) {
						for (int a = 0; a < key.length(); a++) {
							for (int d = 0; d < key.length(); d++) {
								for (int y = 0; y < key.length(); y++) {
									for (int u = 0; u < key.length(); u++) {
										for (int f = 0; f < key.length(); f++) {
											for (int w = 0; w < key.length(); w++) {
												String res = "";
												res += key.substring(i, i + 1);
												res += key.substring(j, j + 1);
												res += key.substring(k, k + 1);
												res += key.substring(g, g + 1);
												res += key.substring(a, a + 1);
												res += key.substring(d, d + 1);
												res += key.substring(y, y + 1);
												res += key.substring(u, u + 1);
												res += key.substring(f, f + 1);
												res += key.substring(w, w + 1);
												combs.add(res);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		Collections.sort(combs);
		System.out.println(combs.get(1000001));
	}
}
