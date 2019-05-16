#include <iostream>
using namespace std;
int main() {
	int n, m; cin >> n >> m;
	string a[m][2];
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < 2; j++) {
			cin >> a[i][j];
		}
	}
	for (int i = 0; i < n; i++) {
		string s, t; cin >> s;
		for (int j = 0; j < m; j++) {
			if (s == a[j][0] || s == a[j][1]) {
				if (a[j][0].length() <= a[j][1].length()) {
					t = a[j][0];
				}
				else {
					t = a[j][1];
				}
				break;
			}
		}
		if (i > 0) cout << ' ';
		cout << t;
	}
	cout << endl; return 0;
}
