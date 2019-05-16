#include <iostream>
#define ld long double
using namespace std;
int main() {
	int n; cin >> n;
	ld d = 0;
	while (n--) {
		ld a, b; cin >> a >> b;
		d += a * b; 
	}
	cout << d << endl;
}
