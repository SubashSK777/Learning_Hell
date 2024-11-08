def solution(S, T):
    n = len(S)
    swaps = 0
    for i in range(n):
        if S[i] != T[i]:
            swaps += 1
    return swaps // 2