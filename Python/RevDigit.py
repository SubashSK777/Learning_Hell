n = int(input("Enter a Number: "))
revDigit = 0
while n > 0:
    lastDigit = n % 10
    revDigit = revDigit * 10 + lastDigit
    