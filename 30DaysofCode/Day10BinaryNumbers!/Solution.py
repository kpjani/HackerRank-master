import sys
def decimal_to_binary(n):
    if n==0:
        return "000"
    if n==1:
        return "001"
    binary=""
    while n>1:
        rem = n%2
        n=n//2
        binary +=str(rem)
    binary+="1"
    return binary[::-1]

T=int(raw_input())
for i in range (0,T):
    num=int(raw_input())
    ans= decimal_to_binary(num)
    print ans