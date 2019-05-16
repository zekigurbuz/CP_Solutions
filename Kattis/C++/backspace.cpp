#include <iostream>
#include <stack>
using namespace std;
int main() {
	string s; cin >> s;
	char a[s.length()]; int q = 0, l = s.length() - 1;
	for (int i = s.length() - 1; i >= 0; i--) {
		if (s.at(i) == '<') q++;
		else if (q > 0) q--;
		else a[l--] = s.at(i);
	}
	for (int i = l + 1; i < s.length(); i++) {
		cout << a[i];
	}
	cout << endl;
}
