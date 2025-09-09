a = list(map(str, input().split((' '))))
aa=0

for i in a:
  if i!='':
    aa+=1
  else:
    aa+=0
print(aa)