//author: zeki gurbuz
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef long double ld;
typedef pair<int, int> pii;
typedef vector<int> vi;
#define int ll
#define double ld
#define M0D 1e9+7
#define imin -2147483748
#define imax +2147483647
#define mp make_pair
#define pb push_back
#define fi first
#define se second
#define forn(a, b) for(int a=0;a<b;a++)
bool ip(int n){if(n<=1)return false;if(n==2)return true;for(int i=2;i*i<=n;i++)if(n%i==0)return false;return true;}
int gcd(int a,int b){if(a==0)return b;return gcd(b%a,a);}
int lcm(int a,int b){return a*b/gcd(a,b);}
int p0wm(int n,int p,int m){if(p==0)return 1;if(p==1)return n%m;if(p%2==0){int t=p0wm(n,p/2,m);return t%m*t%m%m;}int t=p0wm(n,p/2,m);t=t%m*t%m%m;return t%m*n%m%m;}
int p0w(int n,int p){if(p==0)return 1;if(p==1)return n;if(p%2==0){int t=p0w(n,p/2);return t*t;}int t=p0w(n,p/2);return t*t*n;}
int m0d(int n,int m){return(m+(n%m))%m;}
vector<bool> ps(int n){vector<bool> p;forn(i,n+1){p.pb(true);}p[0]=false;p[1]=false;for(int i=2;i*i<=n;i++){if(p[i]){for(int j=i*i;j<=n;j+=i){p[j]=false;}}}return p;}
vi psp(int n){vector<bool>p=ps(n);vi a;forn(i,n+1)if(p[i])a.pb(i);return a;}
signed main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int n, m = 1, x, t = 0; cin >> n;
	int a[5001]; forn(i,5001) a[i] = 0;
	forn(i, n) {
		cin >> x;
		m = max(m, x);
		a[x]++;
	}
	forn(i, 5001) {
		if(i!=m) t+=min(2ll,max(0ll,a[i]));
		else t+=min(1ll,max(0ll,a[i]));
	}
	cout << t << endl;
	bool f = true;
	for (int i = 1; i <= m; i++) {
		if (a[i]) {
			if (f) {f = false;}else{cout << ' ';}
			cout << i;
			a[i]--;
		}
	}
	for (int i = m-1; i >=1; i--) {
		if (a[i]) {
			if (f) {f = false;}else{cout << ' ';}
			cout << i;
		}
	}
	return 0;
}

//printing: double -> int || printf
