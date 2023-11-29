n = int(input())
x_members = list(map(int, input().split()))
x_members.sort()

result = 0
count = 0
for x in x_members:
  count += 1
  if x <= count:
    result += 1
    count = 0

print(result)