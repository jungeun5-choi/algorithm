n,m = map(int, input().split())

result = 0
for i in range(n):
  lst = list(map(int, input().split()))
  min_value = 10001
  for elem in lst:
    min_value = min(min_value, elem)

  result = max(result, min_value)

print(result)