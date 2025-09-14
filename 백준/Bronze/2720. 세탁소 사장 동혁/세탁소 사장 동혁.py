T = int(input())

for i in range(T):
  a = input()
  f=0
  if len(a)==3:
    f = int(a[0]+a[-2:])
  else:
    a = '0'*(3-len(a))+a
    f = int(a[0]+a[-2:])
  q=0
  d=0
  n=0
  p=0
  while True:
    if f==0:
      break

    if f>=25:
      f-=25
      q+=1
    elif f>=10 and f<25:
      f-=10
      d+=1
    elif f>=5 and f<10:
      f-=5
      n+=1
    elif f>=1 and f<5:
      f-=1
      p+=1
        
  print(q,d,n,p)
  


