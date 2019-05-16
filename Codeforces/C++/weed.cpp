#include <iostream>
#include <queue>
using namespace std;

int n, m;
char c[n][m];
bool d[n][m];

void recur(int x, int y) {
	
}

int main() {
	cin >> n >> m;
	int ans = 0;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			cin >> c[i][j];
			d[n][m] = false;
		}
	}
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			if (c[i][j] == '.' && !d[i][j]) {
				recur(i, j);
			}
		}
	}
	cout << ans << '\n';
	return 0;
}
