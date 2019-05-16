import math
x = input().split()
a = int(x[0])
b = int(x[1])
for i in range(1, a * b + 1):
    if (math.ceil(float(i) / float(a)) == b):
        print(i)
        break
