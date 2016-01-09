import sys
def find_gcd(a,b):
    if b!=0:
       return find_gcd(b, a%b)
    else: 
       return a

a,b= raw_input().split()
a=int(a)
b=int(b)
gcd=find_gcd(a,b)
print gcd