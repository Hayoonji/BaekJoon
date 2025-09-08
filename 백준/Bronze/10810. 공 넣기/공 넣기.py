n,m = map(int,input().split())
p=[0]*n



for i in range(m):
  a,b,c = map(int,input().split())
  for k in range(a-1,b):
    p[k] = c

ans=''

for i in p:
  ans+=' '
  ans+=str(i)
print(ans.strip())