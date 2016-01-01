N= int(raw_input())
d={}
for i in range(N):
    str = raw_input()
    x= str.split(" ")
    total = float(x[1]) + float(x[2]) + float(x[3])
    avg = float(total/3)
    d[x[0]] = avg

s = raw_input()
print ('%.2f' % d[s])