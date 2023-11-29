n = int(input())
routes = list(input().split())

x = 1
y = 1

# L R U D에 따른 이동 방향
dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]
move_types = ['L', 'R', 'U', 'D']

for route in routes:
  # 이동 후의 좌표를 구하기
  for i in range(len(move_types)):
    if route == move_types[i]:
      nx = x + dx[i]
      ny = y + dy[i]
      # 공간을 벗어나면 무시
      if nx < 1 or ny < 1 or nx > n or ny > n:
        continue
      # 이동 수행
      x, y = nx, ny

print(x, y)
