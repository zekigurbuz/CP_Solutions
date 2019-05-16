#include <iostream>
#include <map>
#include <vector>
#include <cmath>
using namespace std;
int main() {
	int n, m;
	cin >> n >> m;
	int d[m][2];
	int a[n];
	int p[n];
	for (int i = 0; i < n; i++) cin >> a[i];
	for (int i = 0; i < n; i++) p[i] = a[i];
	map<int, vector<int> > tm; 
	for (int i = 0; i < n; i++) {
		vector<int> s;
		tm[i] = s;
	}
	for (int i = 0; i < m; i++) {
		cin >> d[i][0] >> d[i][1];
		d[i][0]--; d[i][1]--;
		for (int j = d[i][0]; j <= d[i][1]; j++) {
			p[j]--;
			tm[j].push_back(i);
		}
	}
	int best = 0;
	int numq = 0;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			best = max(best, abs(a[i] - a[j]));
		}
	}
	vector<int> qs;
	if (m > 0) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int b1 = p[i];
				int b2 = p[j];
				vector<int> c1 = tm[i];
				vector<int> c2 = tm[j];
				int s1 = c1.size();
				for (int x = 0; x < c1.size(); x++) {
					bool cont = false;
					for (int y = 0; y < c2.size(); y++) {
						if (c2[y] == c1[x]) {
							cont = true;
							break;
						}
					}
					if (!cont) {
						c1.erase(c1.begin() + x--);
					}
				}
				b1 += s1 - c1.size();
				if (best < b1 - b2) {
					best = b1 - b2;
					qs = c2;
					numq = qs.size();
				}
			}
		}
		cout << best << endl;
		cout << numq << endl;
		for (int i = 0; i < numq; i++) {
			if (i > 0) cout << " ";
			cout << qs[i]+1;
		}
		cout << endl;
 	}
 	else {
		cout << best << endl;
		cout << 0 << endl;
	}
}
