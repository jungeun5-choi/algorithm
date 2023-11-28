# input - map 사용
n,m,k = map(int, input().split())
lst = list(map(int, input().split())

lst.sort()

result = 0
while m > 0:
  for limit in range(k):
    result += lst[-1]
    m -= 1
  result += lst[-2]
  m -= 1

print(result)