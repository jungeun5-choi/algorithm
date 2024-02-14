import sys
input = sys.stdin.readline

N, K = map(int, input().split())
values = list(map(int, input().split()))
    
prefix_sum = [0]
tmp = 0
for i in values:
    tmp += i
    prefix_sum.append(tmp)

max_sum = -987654321
for j in range(K, N+1):
    tmp = prefix_sum[j] - prefix_sum[j-K]
    max_sum = max(max_sum, tmp)

print(max_sum)