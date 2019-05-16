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
	int n;cin >> n;
	if (n%2) cout << (n+1)/2%2 << endl;
	else cout << n/2%2 << endl;
	return 0;
}


