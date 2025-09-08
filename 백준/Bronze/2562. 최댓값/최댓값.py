p=[]
for i in range(1,10):
  n = int(input())
  p.append(n)

print(max(p))
print(p.index(max(p))+1)
