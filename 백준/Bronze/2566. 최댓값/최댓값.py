
p=[]
ma = 0
row = 0
col = 0
for i in range(9):
  c = list(map(int,input().split((' '))))
  p.append(c)
  if ma <=max(c):
    ma = max(c)
    row = i
    col = c.index(ma)

print(ma)
print(row+1, col+1)

    
