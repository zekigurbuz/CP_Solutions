#include <iostream>
#include <vector>
#include <map>
#include <cmath>
#include <set>
#include <algorithm>
#include <queue>
#include <random>
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
#define forn(a,b) for(int a=0;a<b;a++)
bool ip(int n){if(n<=1)return false;if(n==2)return true;for(int i=2;i*i<=n;i++)if(n%i==0)return false;return true;}
int gcd(int a,int b){if(a==0)return b;return gcd(b%a,a);}
int lcm(int a,int b){return a*b/gcd(a,b);}
int p0wm(int n,int p,int m){if(p==0)return 1;if(p==1)return n%m;if(p%2==0){int t=p0wm(n,p/2,m);return t%m*t%m%m;}int t=p0wm(n,p/2,m);t=t%m*t%m%m;return t%m*n%m%m;}
int p0w(int n,int p){if(p==0)return 1;if(p==1)return n;if(p%2==0){int t=p0w(n,p/2);return t*t;}int t=p0w(n,p/2);return t*t*n;}
signed main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	string s; cin >> s;
	bool c[s.length()];
	c[s.length()-1] = false;
	for (int i = 0; i < s.length()-1; i++) {
		c[i] = s.at(i) == s.at(i+1);
	}
	int a[s.length()];
	for (int i = 0; i < s.length(); i++) {
		if (!i) {
			a[i] = c[i];
		}
		else {
			a[i] = a[i-1] + c[i];
		}
	}
	int q; cin >> q;
	while (q--) {
		int t, y; cin >> t >> y; t--; y-=2;
		cout << a[y] - (t ? a[t-1] : 0) << endl;
	}
	return 0;
}

//printing: double -> int || printf
