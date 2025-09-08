a=[]
for i in range(10):
  p = int(input())
  a.append(p%42)
print(len(set(a)))