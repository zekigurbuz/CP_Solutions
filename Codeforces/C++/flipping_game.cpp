#include <iostream>
using namespace std;
int main() {
	int n; cin >> n;
	int a[n];
	int max = 0;
	for (int i = 0; i < n; i++) {
		cin >> a[i];
	}
	for (int i = 0; i < n; i++) {
		for (int j = i; j < n; j++) {
			int t = 0;
			for (int x = 0; x < i; x++) if (a[x]) t++;
			for (int x = i; x <= j; x++) if (!a[x]) t++;
			for (int x = j + 1; x < n; x++) if (a[x]) t++;
			if (t > max) max = t;
		}
	}
	cout << max << '\n';
	return 0;
}
