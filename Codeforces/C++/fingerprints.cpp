#include <iostream>
#include <vector>
using namespace std;
int main() {
	int n, m;
	cin >> n >> m;
	vector<int> ans, a, b;
	for (int i = 0; i < n; i++) {
		int c; cin >> c;
		a.push_back(c);
	}
	for (int i = 0; i < m; i++) {
		int c; cin >> c;
		b.push_back(c);
	}
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			if (b[j] == a[i]) {
				ans.push_back(a[i]);
				break;
			}
		}	
	}
	for (int i = 0; i < ans.size(); i++) {
		if (i > 0) {
			cout << " ";
		}
		cout << ans[i];
	}
	cout << endl;
	return 0;
}
