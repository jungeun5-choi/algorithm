n = input()
x = int(ord(n[0])) - int(ord('a')) + 1
y = int(n[1])

steps = [(-2, -1), (-2, 1), (2, -1), (2, 1), (-1, -2), (-1, 2), (1, -2), (1, 2)]

result = 0
for step in steps:
  if (x + step[0] > 0 and y + step[1] > 0) and (x + step[0] < 9 and y + step[1] < 9):
    result += 1

print(result)
