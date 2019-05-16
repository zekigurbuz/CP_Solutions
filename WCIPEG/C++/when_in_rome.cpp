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
string to_roman(int x) {
    string total = "";
    if (x > 1000) return "CONCORDIA CUM VERITATE";
    if (x >= 100) {
		if (x / 100 == 9) {
			total += "CM";
			x -= 900;
		}
		else if (x / 100 >= 5) {
			total += 'D';
			x -= 500;
			forn(i,x/100) total += 'C';
			x -= x/100*100;
		}
		else if (x / 100 == 4) {
			total += "CD";
			x -= 400;
		}
		else {
			forn(i,x/100) total += 'C';
			x -= x/100*100;
		}
	}
	if (x >= 10) {
		if (x / 10 == 9) {
			total += "XC";
			x -= 90;
		}
		else if (x / 10 >= 5) {
			total += 'L';
			x -= 50;
			forn(i,x/10) total += 'X';
			x -= x/10*10;
		}
		else if (x / 10 == 4) {
			total += "XL";
			x -= 40;
		}
		else {
			forn(i,x/10) total += 'X';
			x -= x/10*10;
		}
	}
	if (x >= 0) {
		if (x == 9) {
			total += "IX";
		}
		else if (x >= 5) {
			total += 'V';
			x -= 5;
			forn(i,x) total += 'I';
		}
		else if (x == 4) {
			total += "IV";
		}
		else {
			forn(i,x) total += 'I';
		}
	}
	return total;
}
signed main() {
	ios_base::sync_with_stdio(0);cin.tie(0);
	int n; cin >> n;
	while (n--) {
		string s; cin >> s;
		string a="", b="";
		int ind = 0;
		for(; ind < s.length(); ind++) {
			if(s.at(ind)=='+') break;
			a += s.substr(ind, 1);
		}
		ind++;
		for(;ind < s.length() - 1; ind++) {
			b += s.substr(ind, 1);
		}
		int sum = 0;
		map<char, int> m;
		m['I'] = 1;
		m['V'] = 5;
		m['X'] = 10;
		m['L'] = 50;
		m['C'] = 100;
		m['D'] = 500;
		m['M'] = 1000;
		for(int i = 0; i < a.length(); i++) {
			if (i == a.length() - 1) sum += m[a.at(i)];
			else if ((a.at(i) == 'I' && (a.at(i+1) == 'V' || a.at(i+1) == 'X')) || (a.at(i) == 'X' && (a.at(i+1)=='L'||a.at(i+1)=='C')) || (a.at(i)=='C' && (a.at(i+1)=='D'||a.at(i+1)=='M')))
			sum -= m[a.at(i)];
			else sum += m[a.at(i)];
		}
		for(int i = 0; i < b.length(); i++) {
			if (i == b.length() - 1) sum += m[b.at(i)];
			else if ((b.at(i) == 'I' && (b.at(i+1) == 'V' || b.at(i+1) == 'X')) || (b.at(i) == 'X' && (b.at(i+1)=='L'||b.at(i+1)=='C')) || (b.at(i)=='C' && (b.at(i+1)=='D'||b.at(i+1)=='M'))) {
				sum -= m[b.at(i)];
			}
			else sum += m[b.at(i)];
		}
		string c = to_roman(sum);
		cout << a << "+" << b << +"="<<c<<endl;
	}
	return 0;
}

//printing: double -> int || printf
