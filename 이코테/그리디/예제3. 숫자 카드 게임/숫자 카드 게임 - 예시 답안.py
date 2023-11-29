n,m = map(int, input().split())

result = 0
for i in range(n):
  lst = list(map(int, input().split()))
  min_value = min(lst)
  result = max(result, min_value)

print(result)