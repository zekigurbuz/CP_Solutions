#include <iostream>
using namespace std;
int main() {
	int r, c, a = 0;
	cin >> r >> c;
	char ar[r][c];
	for (int i = 0; i < r; i++) {
		for (int j = 0; j < c; j++) {
			cin >> ar[i][j];
		}
	}
	for (int i = 0; i < r; i++) {
		for (int j = 0; j < c; j++) {
			if (ar[i][j] == 'W') {
				if (i + 1 < r && ar[i+1][j] == 'P') {
					a++;
				}
				else if (i - 1 >= 0 && ar[i-1][j] == 'P') {
					a++;
				}
				else if (j + 1 < c && ar[i][j+1] == 'P') {
					a++;
				}
				else if (j - 1 >= 0 && ar[i][j-1] == 'P') {
					a++;
				}
			}
		}
	}
	cout << a << endl;
}
