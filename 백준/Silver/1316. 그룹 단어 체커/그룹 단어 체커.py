a = int(input())
final=0
for i in range(a):
  ans=0
  b = input()
  p = ' '
  for k in b:
    if (p[-1]!=k) and (k in p):
      break
    else:
      ans+=1
    p+=k
  if ans==len(b):
    final+=1

print(final)
    