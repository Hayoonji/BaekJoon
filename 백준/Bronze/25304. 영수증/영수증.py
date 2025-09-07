a = int(input())
b = int(input())
p=0
for i in range(b):
  c,d = map(int,input().split())
  p+=c*d


if a==p:
  print("Yes")
else:
  print("No")