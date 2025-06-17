arr = [3, 4, 8, 0, 7]

totalSum = sum(arr)

leftSum = 0

for i in arr:
    totalSum -= i
    if leftSum == totalSum:
        print(i)
    
    leftSum += i