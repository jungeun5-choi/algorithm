def is_multiple(n, k):
  return n % k == 0


n, k = map(int, input().split())

count = 0
while n != 1:
  count += 1
  if is_multiple(n, k):
    n /= k
  else:
    n -= 1

print(count)
