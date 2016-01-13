#!/bin/python
import sys
arr = []
for arr_i in xrange(6):
   arr_temp = map(int,raw_input().strip().split(' '))
   arr.append(arr_temp)

Hourglass=[]

for i in range(1,5):
    for j in range(1,5):
        temp=arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+arr[i][j]+arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1]
        Hourglass.append(temp)

print max(Hourglass)
        