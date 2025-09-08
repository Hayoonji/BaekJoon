p=[]
real=[]
for k in range(1,31):
  real.append(k)

for i in range(28):
  a = int(input())
  p.append(a)


for k in real:
  if k in p:
    pass
  else:
    print(k)
