a,b,c = map(int,input().split())
aa=[a,b,c]
m=max(aa)

if a==b and b==c and c==a:
  print(10000+a*1000)
elif a==b and b!=c and c!=a: 
  print(1000+a*100)
elif b==c and c!=a and a!=b:
  print(1000+b*100)
elif c==a and b!=c and a!=b:
  print(1000+c*100)
else:
  print(m*100)