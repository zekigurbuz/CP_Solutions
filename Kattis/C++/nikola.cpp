//code & template: zekigurbuz
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef long double ld;
typedef unsigned long long ull;
typedef pair<int, int> pii;
typedef vector<int> vi;
typedef vector<pii> vpii;
#define int ll
#define double ld
#define M0D 1000000007
#define imin -(1e18)
#define imax 1e18
#define endl '\n'
#define mp make_pair
#define pb push_back
#define fi first
#define se second
#define forn(a, b) for(int a=0;a<b;a++)
const ld PI = 4*atan((ld)1);
bool ip(int n){if(n<=1)return false;if(n==2)return true;for(int i=2;i*i<=n;i++)if(n%i==0)return false;return true;}
int gcd(int a,int b){if(a==0)return b;return gcd(b%a,a);}
int lcm(int a,int b){return a*b/gcd(a,b);}
int p0wm(int n,int p,int m){if(p==0)return 1;if(p==1)return n%m;if(p%2==0){int t=p0wm(n,p/2,m);return t%m*t%m%m;}int t=p0wm(n,p/2,m);t=t%m*t%m%m;return t%m*n%m%m;}
int p0w(int n,int p){if(p==0)return 1;if(p==1)return n;if(p%2==0){int t=p0w(n,p/2);return t*t;}int t=p0w(n,p/2);return t*t*n;}
int m0d(int n,int m){return(m+(n%m))%m;}
int fact(int n){int a=1;for(int i=1;i<=n;i++)a*=i;return a;}
vector<bool> ps(int n){vector<bool> p;forn(i,n+1){p.pb(true);}p[0]=false;p[0]=p[1]=false;for(int i=2;i*i<=n;i++){if(p[i]){for(int j=i*i;j<=n;j+=i){p[j]=false;}}}return p;}
vi psp(int n){vector<bool>p=ps(n);vi a;forn(i,n+1)if(p[i])a.pb(i);return a;}
signed main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int n; cin >> n; int a[n]; forn(i, n) cin >> a[i];
	int b[n + 1]; forn(i, n + 1) b[i] = imax;
	queue<int> q; q.push(1); q.push(0); q.push(0); forn(i, n + 1) q.push(0);
	while (!q.empty()) {
		int pos = q.front(); q.pop();
		int cost = q.front(); q.pop();
		int jump = q.front(); q.pop();
		int vis[n + 1]; forn(i, n + 1) {vis[i] = q.front(); q.pop();}
		if (pos == 1 && jump == 0) {
			q.push(2); q.push(0); q.push(1); vis[1]++; forn(i, n + 1) q.push(vis[i]);
		}
		else {
			if (pos < 1 || pos > n) continue;
			if (vis[pos] > 2) continue;
			vis[pos]++;
			cost += a[pos - 1];
			b[pos] = min(b[pos], cost);
			if (pos == n) continue;
			q.push(pos + jump + 1); q.push(cost); q.push(jump + 1); forn(i, n + 1) q.push(vis[i]);
			q.push(pos - jump); q.push(cost); q.push(jump); forn(i, n + 1) q.push(vis[i]);
		}
	}
	cout << b[n] << endl;
	return 0;
}

//printing: double -> int || printf
