def solution(A, B):
    N = len(A)
    max_top_path = [0] * N
    max_top_path[0] = A[0]
    for i in range(1, N):
        max_top_path[i] = max(max_top_path[i - 1], A[i])
    
    max_bottom_path = [0] * N
    max_bottom_path[-1] = B[-1]
    for i in range(N - 2, -1, -1):
        max_bottom_path[i] = max(max_bottom_path[i + 1], B[i])
    
    return min(max(max_top_path[i], max_bottom_path[i]) for i in range(N))