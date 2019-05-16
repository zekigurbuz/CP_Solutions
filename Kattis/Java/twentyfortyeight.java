
import java.util.*;
import java.io.*;

class twentyfortyeight {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[4][4];
		for (int i = 0; i < 4; i++) {
			arr[i] = Arrays.stream(file.readLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
		}
		int rot = Integer.parseInt(file.readLine());
		for (int i = 0; i < rot; i++) {
			arr = rot(arr);
		}
		for (int i = 0; i < 4; i++) {
			shiftNums(arr[i]);
		}
		for (int i = 0; i < 4 - rot; i++) {
			arr = rot(arr);
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	public static void shiftNums(int[] arr) {
		boolean[] visited = new boolean[4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j - 1 >= 0 && !visited[j-1]; j--) {
				if (arr[j-1] == 0) {
					arr[j-1] = arr[j];
					arr[j] = 0;
				}
				else if (arr[j-1] == arr[j]) {
					arr[j-1] <<= 1;
					arr[j] = 0;
					visited[j-1] = true;
					break;
				}
				else break;
			}
		}
	}
	public static int[][] rot (int[][] arr) {
		int[][] res = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				res[3 - j][i] = arr[i][j];
			}
		}
		return res;
	}
}
