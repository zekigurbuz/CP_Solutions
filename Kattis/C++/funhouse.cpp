#include <iostream>
using namespace std;

int main() {
	int tc = 1;
	while (true) {
		int a, b;
		cin >> b >> a;
		if (a == 0 && b == 0) break;
		char m[a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				cin >> m[i][j];
			}
		}
		int dx = -1, dy = -1, x = -1, y = -1;
		for (int i = 0; i < a; i++) {
			if (m[i][0] == '*') {
				dx = 0; dy = 1;
				x = i; y = 0;
			}
			else if (m[i][b-1] == '*') {
				dx = 0; dy = -1;
				x = i; y = b-1;
			}
		}
		for (int i = 0; i < b; i++) {
			if (m[0][i] == '*') {
				dx = 1; dy = 0;
				x = 0; y = i;
			}
			else if (m[a-1][i] == '*') {
				dx = -1; dy = 0;
				x = a-1; y = i;
			}
		}
		x += dx; y += dy;
		while (true) {
			if (m[x][y] == 'x') {
				m[x][y] = '&';
				break;
			}
			if (m[x][y] == '.') {}
			else if (m[x][y] == '/') {
				if (dx == 1) {
					dx = 0; dy = -1;
				}
				else if (dx == -1) {
					dx = 0; dy = 1;
				}
				else if (dy == 1) {
					dx = -1; dy = 0;
				}
				else {
					dx = 1; dy = 0;
				}
			}
			else if (m[x][y] == '\\') {
				if (dx == 1) {
					dx = 0; dy = 1;
				}
				else if (dx == -1) {
					dx = 0; dy = -1;
				}
				else if (dy == 1) {
					dx = 1; dy = 0;
				}
				else {
					dx = -1; dy = 0;
				}
			}
			x += dx; y += dy;
		}
		cout << "HOUSE " << tc++ << endl;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				cout << m[i][j];
			}
			cout << endl;
		}
	}
}
