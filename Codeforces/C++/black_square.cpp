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
	int a[5];
	cin >> a[1] >> a[2] >> a[3] >> a[4];
	string s; cin >> s;
	int t = 0;
	for (int i = 0; i < s.length(); i++) {
		t += a[s.at(i)-'0'];
	}
	cout << t << endl;
	return 0;
}


