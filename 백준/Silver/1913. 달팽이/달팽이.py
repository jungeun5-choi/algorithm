import sys
input = sys.stdin.readline

# 하 우 상 좌
dr = [1, 0, -1, 0]
dc = [0, 1, 0, -1]

N = int(input())
pos = int(input())

snail = [[0] * N for _ in range(N)] # [[0,0,0],[0,0,0],[0,0,0], ...]
r, c, d = 0, 0, 0

x, y = 0, 0

# N**2 = N의 제곱
for num in range(N ** 2, 0, -1):
    snail[r][c] = num
    if num == pos:
        x, y = r + 1, c + 1

    nr, nc = r + dr[d], c + dc[d]
    if nr < 0 or nr >= N or nc < 0 or nc >= N or snail[nr][nc] != 0:
        d = (d+1) % 4 # 방향 전환
        nr, nc = r + dr[d], c + dc[d]
        
    r, c = nr, nc

for s in snail:
    print(*s)
print (x, y)