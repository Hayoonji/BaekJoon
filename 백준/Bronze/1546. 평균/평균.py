n = int(input())
a = list(map(int,input().split((' '))))
ma = max(a)

all=0
for i in a:
  all+=(i/ma*100)

print(all/n)