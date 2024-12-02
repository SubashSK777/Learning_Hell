b = "Malayalam"
b = b.lower()
straight = b[::-1]
reverse = b[::1]

if straight == reverse:
	print("It is an Anagram")
else:
	print("It is not an Anagram")
