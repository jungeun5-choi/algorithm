from collections import deque

n, m = map(int, input().split())
px, py, pdir = map(int, input().split())
dir = pdir

map_data = []
for size in range(m):
  data = tuple(map(int, input().split()))
  map_data.append(data)


def turn_left():
  global dir
  dir -= 1
  if dir < 0:
    dir = 3


dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
turn_count = 0

dq = deque()
dq.append([px, py])

result = 1
while True:
  turn_left()
  x = px + dx[dir]
  y = py + dy[dir]
  if dq.count([x, y]) == 0 and map_data[x][y] == 0:
    dq.append([x, y])
    px = x
    py = y
    result += 1
    turn_count = 0
    continue
  else:
    turn_count += 1

  if turn_count == 4:
    x = px - dx[dir]
    y = py - dy[dir]
    if map_data[x][y] == 0:
      px = x
      py = y
    else:
      break
    turn_count = 0

print(result)
