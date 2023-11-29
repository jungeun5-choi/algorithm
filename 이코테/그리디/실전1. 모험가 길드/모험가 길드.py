n = int(input())
x_members = list(map(int, input().split()))
x_members.sort(reverse=True)

result = 0
count = 0
standard = x_members[0]
for x in x_members:
  count += 1
  if standard <= count:
    result += 1
    count = 0
    standard = x

print(result)