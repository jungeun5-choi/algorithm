import sys
input = sys.stdin.readline

# N = 숫자의 개수
# M = 합을 구해야하는 횟수
N, M = map(int, input().split())
values = list(map(int, input().split()))

prefix_sum = [0]
tmp = 0
for v in values:
    tmp += v
    prefix_sum.append(tmp)

for m in range(M):
    i, j = map(int, input().split())
    res = prefix_sum[j] - prefix_sum[i-1]
    print(res)