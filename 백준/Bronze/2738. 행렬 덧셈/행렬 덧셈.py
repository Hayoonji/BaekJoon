a,b = list(map(int,input().split((' '))))
p=[]
for i in range(2):
  for j in range(a):
    c = list(map(int,input().split((' '))))
    p.append(c)


for i in range(a):
  an = ''
  for j in range(b):
    an+= str(p[i][j]+p[a+i][j])
    an+=' '
  an = an.strip()
  print(an)