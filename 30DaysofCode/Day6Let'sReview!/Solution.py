def  StairCase(n):
    for i in range(1,n):
        t=n-i-1
        print " "*t ,"#"*i
    print "#"*n

num=int(raw_input())
StairCase(num)