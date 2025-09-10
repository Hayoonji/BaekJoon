a = list(map(int,input().split(' ')))
b= [1,1,2,2,2,8]
p=''

for i in range(len(a)):
  p+=str(b[i]-a[i])
  p+=' '
print(p.strip())