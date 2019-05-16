#include <iostream>
#include <queue>
using namespace std;

int n, m, p;
char mat[1000][1000];
bool vis[1000][1000];
bool use[1000][1000];
int s[9];
int a[9];

struct State {
	int s, x, y, id;
	State(int s1, int x1, int y1, int id1) {
		s = s1;
		x = x1;
		y = y1;
		id = id1;
	}
};

int main() {
	cin >> n >> m >> p;
	for (int i = 0; i < p; i++) cin >> s[i];
	for (int i = 0; i < p; i++) a[i] = 0;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			char b; cin >> b;
			int f = 0;
			if (b >= '1' && b <= '9') f = b - '1' + 1;
			else if (b == '#') f = 11;
			mat[i][j] = f;
		}
	}
	bool done = false;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			vis[i][j] = false;
			use[i][j] = false;
		}
	}
	while (!done) {
		done = true;
		for (int i = 1; i <= p; i++) {
			queue<State> q;
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < m; k++) {
					if (mat[j][k] == i) {
						if (!use[j][k])
						q.push(State(s[i-1],j,k,i));
						use[j][k] = true;
					}
				}
			}
			while (q.size()) {
				State cur = q.front();
				//cout << cur.x << " " << cur.y << endl;
				q.pop();
				if (cur.s < 0 || cur.x < 0 || cur.y < 0 || cur.x >= n || cur.y >= m || mat[cur.x][cur.y] == 11 || (vis[cur.x][cur.y] && cur.s != s[cur.id-1])|| (mat[cur.x][cur.y] != cur.id && mat[cur.x][cur.y] >= 1 && mat[cur.x][cur.y] <= 9)) continue;
				
				done = false;
				mat[cur.x][cur.y] = cur.id;
				if (!vis[cur.x][cur.y])a[cur.id-1]++;
				vis[cur.x][cur.y] = true;
				q.push(State(cur.s - 1, cur.x + 1, cur.y, cur.id));
				q.push(State(cur.s - 1, cur.x - 1, cur.y, cur.id));
				q.push(State(cur.s - 1, cur.x, cur.y + 1, cur.id));
				q.push(State(cur.s - 1, cur.x, cur.y - 1, cur.id));
			}
		}
	}
	for (int i = 0; i < p; i++) {
		if (i > 0) {
			cout << " ";
		}
		cout << a[i];
	}
	cout << endl;
	return 0;
}
