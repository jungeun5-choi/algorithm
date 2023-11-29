def check_rest(h, m, s):
  if h % 10 == 3 or m % 10 == 3 or s % 10 == 3:
    return True


def check_thirty(m, s):
  if m // 10 == 3 or s // 10 == 3:
    return True


n = int(input())

result = 0
for h in range(n + 1):  # 시
  for m in range(60):  # 분
    for s in range(60):  # 초
      if check_rest(h, m, s) or check_thirty(m, s):
        result += 1

print(result)