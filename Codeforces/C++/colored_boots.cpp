//code & template: zekigurbuz
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef long double ld;
typedef unsigned long long ull;
typedef pair<int, int> pii;
typedef vector<int> vi;
#define int ll
#define double ld
#define M0D 1000000007
#define imin -2147483648
#define imax +2147483647
#define endl '\n'
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
int fact(int n){int a=1;for(int i=1;i<=n;i++)a*=i;return a;}
vector<bool> ps(int n){vector<bool> p;forn(i,n+1){p.pb(true);}p[0]=false;p[0]=p[1]=false;for(int i=2;i*i<=n;i++){if(p[i]){for(int j=i*i;j<=n;j+=i){p[j]=false;}}}return p;}
vi psp(int n){vector<bool>p=ps(n);vi a;forn(i,n+1)if(p[i])a.pb(i);return a;}
signed main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int n; cin >> n; pair<pii, int> a[n], b[n]; bool y[n],t[n]; forn(i, n) y[i]=t[i]=false;
	forn(i, n) {
		char c; cin >> c;
		a[i] = mp(mp(c=='?'?imax:(int)c,(int)c),i+1);
	}
	forn(i, n) {
		char c; cin >> c;
		b[i] = mp(mp(c=='?'?imax:(int)c,(int)c),i+1);
	}
	sort(a,a+n); sort(b,b+n);
	vector<pii> v;
	int c=0, d=0, e=n, f=n;
	forn(i, n) if (a[i].fi.se=='?'){e=i;break;}
	forn(i, n) if (b[i].fi.se=='?'){f=i;break;}
	while (c<n&&d<n){
		if((a[c].fi.se==b[d].fi.se || a[c].fi.se==(int)'?' || b[d].fi.se==(int)'?') && !y[c] && !t[d]) {
			v.pb(mp(a[c].se, b[d].se));
			y[c] = true;
			t[d] = true;
			c++;
			d++;
		}
		else if (e<n) {
			while (e<n&&y[e])e++;
			if (e<n&&!t[d]) {
				v.pb(mp(a[e].se,b[d].se));
				y[e] = true;
				t[d] = true;
				e++;
				d++;
			}
		}
		else if (f<n) {
			while (f<n&&t[f])f++;
			if(f<n&&!y[c]) {
				v.pb(mp(a[c].se,b[f].se));
				y[c] = true;
				t[f] = true;
				c++;
				f++;
			}
		}
		else if (a[c].fi.fi<b[d].fi.fi) c++;
		else d++;
	}
	int g=0, h=0;
	while (g<n&&h<n) {
		while(g<n&&y[g])g++;
		while(h<n&&t[h])h++;
		if(g>=n||h>=n) break;
		if(a[g].fi.se=='?' || b[h].fi.se=='?') {
			v.pb(mp(a[g].se,b[h].se));
			y[g] = true;
			t[h] = true;
			g++;
			h++;
		}
		else if (g<h)g++;
		else h++;
	}
	
	cout << v.size() << endl;
	forn(i, v.size()) {
		cout << v[i].fi << " " << v[i].se << endl;
	}
	return 0;
}

//printing: double -> int || printf

