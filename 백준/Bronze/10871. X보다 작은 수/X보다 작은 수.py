n,x = list(map(int,input().split((' '))))
a = list(map(int,input().split((' '))))
p=''
for i in a:
  if i<x:
    p+=' '
    p+=str(i)


print(p.strip())