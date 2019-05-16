#include <iostream>
#include <vector>
#include <map>
#include <cmath>
#include <set>
#include <algorithm>
#define int long long
#define double long double
using namespace std;
signed main() {
	int n, m;
	cin >> n >> m;
	set<int> s;
	for (int i = 0; i < n; i++) {
		int x; cin >> x;
		while (x--) {
			int t; cin >> t;
			s.insert(s.begin(), t);
		}
	}
	cout << (s.size() == m ? "YES" : "NO") << endl;
	return 0;
}

