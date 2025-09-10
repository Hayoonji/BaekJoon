

score={'A+':4.5,'A0':4.0,'B+':3.5,'B0':3.0,'C+':2.5,'C0':2.0,'D+':1.5,'D0':1.0,'F':0.0}
leng=0
total=0
for i in range(20): #최종적으로 20으로 바꾸기
  a,b,c = list(map(str,input().split((' '))))
  if c!='P':
    leng+=float(b)
    total+= (float(b) * score[c])
  
print(total/leng)
    