#include <iostream>
#include <algorithm>
using namespace std;
int main() {
	int n; cin >> n;
	int a[n];
	for (int i = 0; i < n; i++) cin >> a[i];
	sort(a, a + n);
	for (int i = 0; i < n; i++) {
		int ind = i;
		for (int j = i + 1; j < n;) {
			if (a[j] == a[j-1] + 1) {
				ind = j++;
			}
			else break;
		}
		if (i > 0) cout << " ";
		if (ind - i > 1) {
			cout << a[i] << "-" << a[i] + ind-i;
		}
		else {
			cout << a[i];
		}
		if (ind - i > 1) i = ind;
	}
	cout << endl;
}
