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
	int n; cin >> n;
	string c; cin >> c;
	string s = c.substr(0, 1);
	for (int i = 1; i < n; i++) {
		if (c.at(i) != c.at(i-1)) {
			s += c.substr(i, i+1);
		}
	}
	cout << s << endl;
	return 0;
}


