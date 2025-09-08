n,m = map(int,input().split())
p=[]
for i in range(1,n+1):
  p.append(i)

for k in range(m):
  a,b = map(int,input().split())
  o = p[b-1]
  j = p[a-1]
  p[a-1] = o
  p[b-1]= j

s=''
for k in p:
  s+=' '
  s+=str(k)
print(s.strip())