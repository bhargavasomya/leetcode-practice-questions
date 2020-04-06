'''
Given an array of integers, find the subset of non-adjacent elements with the maximum sum. Calculate the sum of that subset.

For example, given an array  we have the following possible subsets:

Subset      Sum
[-2, 3, 5]   6
[-2, 3]      1
[-2, -4]    -6
[-2, 5]      3
[1, -4]     -3
[1, 5]       6
[3, 5]       8
Our maximum subset sum is .
'''
 #!/bin/python3

import math
import os
import random
import re
import sys

# Complete the maxSubsetSum function below.
def maxSubsetSum(arr):
    maxarr = []
    for ii in range(len(arr)):
        if ii == 0:
            maxarr.append(arr[0])
        elif ii == 1:
            maxarr.append(max(arr[0], arr[1]))
        else:
            maxarr.append(max(arr[ii], arr[ii]+ maxarr[ii-2], maxarr[ii-1]))
    
    return maxarr[-1]
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    res = maxSubsetSum(arr)

    fptr.write(str(res) + '\n')

    fptr.close()
