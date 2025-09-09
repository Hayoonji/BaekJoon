n = int(input())
for i in range(n):
  a,b = input().split((' '))
  p=''
  for k in b:
    p += k*int(a)
  print(p)
