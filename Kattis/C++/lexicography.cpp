#include <iostream>
#include <map>
#include <set>
#define ull unsigned long long
using namespace std;

int main() {
	while (true) {
		char ccc[16];
		ull k;
		cin >> ccc >> k;
		map<char, ull> m;
		set<char> s;
		int n = 0;
		for (int i = 0; i < 16; i++) {
			if (ccc[i] < 'A' || ccc[i] > 'Z') break;
			n++;
		}
		char c[n];
		for (int i = 0; i < n; i++) {
			c[i] = ccc[i];
		}
		if (k == 0 && c[0] == '#' && n == 1) break;
		ull f = 1;
		for (ull i = 1; i <= n; i++) {
			f *= i;
		}
		for (int i = 0; i < n; i++) {
			m[c[i]]++;
			s.insert(s.begin(), c[i]);
		}
		set<char>::iterator it = s.begin();
		while (it != s.end()) {
			f /= m[*it];
			advance(it, 1);
		}
		sort(c, c + n);
		ull q = f / n;
	}
}
