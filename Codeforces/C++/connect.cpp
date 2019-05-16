#include <iostream>
#include <vector>
#include <cmath>
#define int long long
#define double long double
using namespace std;
bool vis[50][50];
char a[50][50];
vector<pair<int, int> > p1, p2;
int n, r1, c1, r2, c2;
void recur(int x, int y, vector<pair<int, int> > &v) {
	if (x < 0 || x >= n || y < 0 || y >= n || vis[x][y] || a[x][y] == '1') return;
	vis[x][y] = true;
	v.push_back(make_pair(x, y));
	recur(x + 1, y, v);
	recur(x - 1, y, v);
	recur(x, y + 1, v);
	recur(x, y - 1, v);
}
signed main() {
	cin >> n >> r1 >> c1 >> r2 >> c2;
	r1--; r2--; c1--; c2--;
	
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			cin >> a[i][j];
			vis[i][j] = false;
		}
	}
	vector<vector<pair<int, int> > > lands;

	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (!vis[i][j] && a[i][j] == '0') {
				vector<pair<int, int> > v;
				recur(i, j, v);
				lands.push_back(v);
				for (int x = 0; x < v.size(); x++) {
					if (v[x].first == r1 && v[x].second == c1) {
						p1 = v;
					}
					if (v[x].first == r2 && v[x].second == c2) {
						p2 = v;
					}
				}
			}
		}
	}
	int mmin = 5001;
	for (int i = 0; i < p1.size(); i++) {
		for (int j = 0; j < p2.size(); j++) {
			int dist = (int)(pow((p1[i].first - p2[j].first),2) + pow((p1[i].second - p2[j].second),2) ); 
			mmin = min(mmin, dist);
		}
	}
	cout << mmin << endl;
	return 0;
}
