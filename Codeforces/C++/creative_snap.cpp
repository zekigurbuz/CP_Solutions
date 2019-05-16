#include <iostream>
#include <algorithm>
#include <functional>
#include <queue>
#include <vector>
#define ull unsigned long long

using namespace std;
int main() {
	int n, k;
	ull a, b;
	cin >> n >> k >> a >> b;
	int arr[n];
	for (int i = 0; i < n; i++) arr[i] = 0;
	for (int i = 0; i < k; i++) {
		int av; cin >> av;
		arr[av]++;
	}
	
	return 0;
}
