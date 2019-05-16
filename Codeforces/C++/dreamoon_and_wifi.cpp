//code & template: zekigurbuz
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef long double ld;
typedef unsigned long long ull;
typedef pair<int, int> pii;
typedef vector<int> vi;
#define int ll
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
int recur(string a, string b, int ind, int aa, int bb) {
	if (ind == a.length()) return aa==bb;
	if (a.at(ind)=='?'&&b.at(ind)=='?') {
		return recur(a,b,ind+1,aa+1,bb+1)+ 
		recur(a,b,ind+1,aa+1,bb-1)+
		recur(a,b,ind+1,aa-1,bb+1)+
		recur(a,b,ind+1,aa-1,bb-1);
	}
	else if (a.at(ind)=='?') {
		return recur(a,b,ind+1,aa+1,bb+(b.at(ind)=='+'?1:-1))+
		recur(a,b,ind+1,aa-1,bb+(b.at(ind)=='+'?1:-1));
	}
	else if (b.at(ind)=='?') {
		return recur(a,b,ind+1,aa+(a.at(ind)=='+'?1:-1),bb+1)+
		recur(a,b,ind+1,aa+(a.at(ind)=='+'?1:-1),bb-1);
	}
	else {
		return recur(a,b,ind+1,aa+(a.at(ind)=='+'?1:-1),bb+(b.at(ind)=='+'?1:-1));
	}
}
signed main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	string a, b; cin >> a >> b;
	int x = recur(a, b, 0, 0, 0); double t=0; forn(i, a.length()) t+=a.at(i)=='?'; forn(i, b.length()) t+=b.at(i)=='?';
	t=p0w(2,t);
	printf("%.20f\n", x/t);
	return 0;
}

//printing: double -> int || printf
