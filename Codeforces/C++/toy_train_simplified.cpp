#include <iostream>
#include <algorithm>
#include <vector>
#include <cmath>
#define int long long
using namespace std;
signed main() {
	int n, m; cin >> n >> m;
	vector<int> a[n];
	for (int i = 0; i < m; i++) {
		int b, c; cin >> b >> c;
		b--; c--;
		a[b].push_back(c);
	}
	//algo = dist(start, i) + n * (out(i) - 1) + dist(i, end)
	for (int i = 0; i < n; i++) {
		int dist = i + n * (a[i].size() - 1);
	}
}
