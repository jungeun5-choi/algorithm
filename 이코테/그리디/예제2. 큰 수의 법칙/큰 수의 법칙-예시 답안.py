# 책 답안 예시
n,m,k = map(int, input().split())
lst = list(map(int, input().split()))
lst.sort()

count = int(m / (k + 1)) * k
count += m % (k + 1)

result = 0
result += count * lst[-1]
result += (m - count) * lst[-2]

print(result)