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
	map<string, int> m;
	{
	m["="] = 1;
	m["+="] = 1;
	m["-="] = 1;
	m["*="] = 1;
	m["/="] = 1;
	m["%="] = 1;
	m["&="] = 1;
	m["^="] = 1;
	m["|="] = 1;
	m["<<="] = 1;
	m[">>="] = 1;
	m[">>>="] = 1;
	m["?:"] = 2;
	m["||"] = 3;
	m["&&"] = 4;
	m["|"] = 5;
	m["^"] = 6;
	m["&"] = 7;
	m["!="] = 8;
	m["=="] = 8;
	m["<"] = 9;
	m["<="] = 9;
	m[">"] = 9;
	m[">="] = 9;
	m["instanceof"] = 9;
	m["<<"] = 10;
	m[">>"] = 10;
	m[">>>"] = 10;
	m["+ (add)"] = 11;
	m["+ (concat)"] = 11;
	m["- (sub)"] = 11;
	m["*"] = 12;
	m["/"] = 12;
	m["%"] = 12;
	m["() (cast)"] = 13;
	m["new"] = 13;
	m["++ (pre)"] = 14;
	m["-- (pre)"] = 14;
	m["+ (unary)"] = 14;
	m["- (unary)"] = 14;
	m["!"] = 14;
	m["~"] = 14;
	m["++ (post)"] = 15;
	m["-- (post)"] = 15;
	m["[]"] = 16;
	m["."] = 16;
	m["()"] = 16;
	}
	bool b[47]; forn(i, 47) b[i] = false;
	string s[47];
	{
	s[0] = "[]";
	s[1] = ".";
	s[2] = "()";
	s[3] = "++ (post)";
	s[4] = "-- (post)";
	s[5] = "++ (pre)";
	s[6] = "-- (pre)";
	s[7] = "+ (unary)";
	s[8] = "- (unary)";
	s[9] = "!";
	s[10] = "~";
	s[11] = "() (cast)";
	s[12] = "new";
	s[13] = "*";
	s[14] = "/";
	s[15] = "%";
	s[16] = "+ (add)";
	s[17] = "- (sub)";
	s[18] = "+ (concat)";
	s[19] = "<<";
	s[20] = ">>";
	s[21] = ">>>";
	s[22] = "<";
	s[23] = ">";
	s[24] = "<=";
	s[25] = ">=";
	s[26] = "instanceof";
	s[27] = "==";
	s[28] = "!=";
	s[29] = "&";
	s[30] = "^";
	s[31] = "|";
	s[32] = "&&";
	s[33] = "||";
	s[34] = "?:";
	s[35] = "=";
	s[36] = "+=";
	s[37] = "-=";
	s[38] = "*=";
	s[39] = "/=";
	s[40] = "%=";
	s[41] = "&=";
	s[42] = "^=";
	s[43] = "|=";
	s[44] = "<<=";
	s[45] = ">>=";
	s[46] = ">>>=";
	}	
	forn(i, 100000) {
		int a = rand() % 47;
		int ba = rand() % 47;
		string t = s[a];
		s[a] = s[ba];
		s[ba] = t;
	}
	bool done = false;
	int wrong = 0;
	while (!done) {
		int ind = -1;
		forn(i, 47) {
			if (!b[i]) {
				ind = i;
				break;
			}
		}
		if (ind == -1) break;
		cout << s[ind] << endl;
		int guess; cin >> guess;
		if (m[s[ind]] == guess) {
			b[ind] = true;
			cout << "Right!" << endl;
		}
		else {
			cout << "Wrong!" << endl;
			wrong++;
		}
		forn(i, 100000) {
			int a = rand() % 47;
			int ba = rand() % 47;
			string t = s[a];
			s[a] = s[ba];
			s[ba] = t;
			bool tt = b[a];
			b[a] = b[ba];
			b[ba] = tt;
		}
	}
	cout << "Wrong: " << wrong << endl;
	return 0;
}

//printing: double -> int || printf

