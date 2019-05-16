import math
x = input().split()
n = int(x[0])
w = int(x[1])
h = int(x[2])
for i in range(n):
    t = int(input())
    if (math.sqrt(w*w+h*h) >= t):
        print("DA")
    else:
        print("NE")