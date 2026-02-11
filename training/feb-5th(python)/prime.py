n=int(input())
f=1
if n<2:
    f=0
for i in range(2,int(n**0.5)+1):
    if n%i==0:
        f=0
print(f==1)

