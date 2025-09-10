a = list(input('').upper())


b=list(set(a))
pp=[0]*len(b)

for i in a:
  for j in b:
    if i==j:
      z = (b.index(j))
      pp[z] += 1
      break


mm = max(pp)
l=0
for k in pp:
  if k == mm:
    l+=1

if l>=2:
  print("?")

else:
  m = pp.index(max(pp))
  print(b[m])

