# 서로 다른 n개 중 m개를 뽑는 경우의 수 공식
# n!/((n-m)!*m!)


def factorial(num):
    result = 1
    for i in range(1, num + 1):
        result *= i
    return result


def solution(balls, share):
    return int(factorial(balls) / (factorial(balls - share) * factorial(share)))