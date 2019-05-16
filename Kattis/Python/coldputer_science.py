input()
ans = 0
for i in input().split():
    ans += 1 if int(i) < 0 else 0
print(ans)