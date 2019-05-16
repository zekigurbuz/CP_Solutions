n = int(input())
ans = 0.0
for i in range(n):
    a, b = map(float, input().split())
    ans += a * b
print(ans)