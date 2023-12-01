# [N x M] 얼음틀
# 구멍 = 0, 칸막이 = 1
# 0끼리 한 면이라도 이어져있으면 = 아이스크림

n, m = map(int, input().split())

graph = []
for i in range(n):
  graph.append(list(map(int, input())))


def dfs(x, y):
  if x <= -1 or x >= n or y <= -1 or y >= m:  # 범위 체크
    return False
  if graph[x][y] == 0:  # 방문 체크
    graph[x][y] = 1
    # 상하좌우 방문
    dfs(x - 1, y)
    dfs(x + 1, y)
    dfs(x, y - 1)
    dfs(x, y + 1)
    return True
  return False


count = 0
for i in range(n):
  for j in range(m):
    if dfs(i, j) == True:
      count += 1

print(count)
