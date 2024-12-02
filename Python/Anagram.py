def isPalindrome(b: str) -> bool:
	b = b.replace(" ", "").lower()
	return b == b[::-1]

print(isPalindrome("A man a plan a canal Panama"))