# N x M 크기의 미로
# 현재 위치 = (1, 1)
# 괴물 있음 = 0, 괴물 없음 = 1

from collections import deque

n, m = map(int, input().split())

graph = []
for i in range(n):
  graph.append(list(map(int, input())))

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]


def bfs(x, y):
  queue = deque()
  queue.append((x, y))

  while queue:  # 큐가 빌 때까지 반복
    x, y = queue.popleft()
    for i in range(4):
      nx = x + dx[i]
      ny = y + dy[i]
      # 공간을 벗어난 경우 무시
      if nx < 0 or ny < 0 or nx >= n or ny >= m:
        continue
      # 벽인 경우 무시
      if graph[nx][ny] == 0:
        continue
      # 해당 노드를 방문하는 경우에만 최단 거리 기록
      if graph[nx][ny] == 1:
        graph[nx][ny] = graph[x][y] + 1
        queue.append((nx,ny))

  # 가장 오른쪽 아래까지의 최단 거리 반환
  return graph[n - 1][m - 1]


print(bfs(0, 0))
