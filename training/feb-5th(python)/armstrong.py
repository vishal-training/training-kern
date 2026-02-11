n=int(input())
s=0
t=n
l=len(str(n))
while t>0:
    s+=int(t%10)**l
    t//=10
print(s==n)

