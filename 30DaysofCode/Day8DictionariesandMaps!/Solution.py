#!/bin/python3
import sys
n = int(input())
dict = {}
for x in range(0, n):
    name = raw_input()
    number = input()
    dict[name] = number
for n in sys.stdin:
    name = str(n.strip())
    if name in dict:
        print(name+"="+str(dict[name]))
    else:
        print("Not found")