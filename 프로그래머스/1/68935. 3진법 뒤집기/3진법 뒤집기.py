def solution(n):
    th = ""
    while n != 0:
        th += str(n % 3)
        n = n // 3
    return int(th, 3) # 파이썬 진법 변환