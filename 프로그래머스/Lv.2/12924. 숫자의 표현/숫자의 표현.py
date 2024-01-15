import math


def solution(n):
    answer = 1
    half = math.ceil(n / 2)
    for i in range(1, half):
        temp = 0
        while (temp < n):
            temp += i
            if (temp == n):
                answer += 1
                break
            i += 1
    return answer