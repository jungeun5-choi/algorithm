n = int(input())

result = 0
for h in range(n + 1):  # 시
  for m in range(60):  # 분
    for s in range(60):  # 초
      if '3' in str(h) + str(m) + str(s):
        result += 1

print(result)