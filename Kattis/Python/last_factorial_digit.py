import array
n = int(input())
for i in range(n):
    x = int(input())
    a = array.array('i', [1,1,2,6,4,0,0,0,0,0,0])
    print(a[x])