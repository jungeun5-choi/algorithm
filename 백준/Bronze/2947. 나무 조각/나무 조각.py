import sys
input = sys.stdin.readline

nums = list(map(int, input().split()))

for i in range(len(nums)-1, 0, -1):
    if nums == [1, 2, 3, 4, 5]: break
    for j in range(i):
        if nums[j] > nums[j+1]:
            nums[j], nums[j+1] = nums[j+1], nums[j]
            print(*nums)