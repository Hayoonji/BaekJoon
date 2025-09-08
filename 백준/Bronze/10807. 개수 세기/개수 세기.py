a = int(input())

b = list(map(int,input().split((' '))))
c = int(input())

p=0
for i in b:
  if i==c:
    p+=1
print(p)