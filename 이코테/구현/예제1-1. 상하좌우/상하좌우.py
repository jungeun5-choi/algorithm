n = int(input())
routes = list(input().split())
min = 1


def is_in_min_range(where, move):
  return (where + move) >= min


def is_in_max_range(where, move):
  return (where + move) <= n


x = 1
y = 1

for r in routes:
  if r == 'L':
    if is_in_min_range(y, -1):
      y -= 1
  elif r == 'R':
    if is_in_max_range(y, +1):
      y += 1
  elif r == 'U':
    if is_in_min_range(x, -1):
      x -= 1
  else:
    if is_in_max_range(x, +1):
      x += 1

print(x, y)
